
import java.util.ArrayList;
import java.util.HashMap;


public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translated =  this.dictionary.get(word);
        translated.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
}
