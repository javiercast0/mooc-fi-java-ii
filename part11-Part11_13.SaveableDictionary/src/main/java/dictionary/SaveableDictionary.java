package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        // Busca en las claves (traducción directa)
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        // Busca en los valores (traducción inversa)
        for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        // Si no se encuentra la palabra
        return null;
    }

    public void delete(String word) {
        // Elimina la palabra si está en las claves
        this.dictionary.remove(word);

        // Elimina la palabra si está en los valores (traducción inversa)
        this.dictionary.entrySet().removeIf(entry -> entry.getValue().equals(word));
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}