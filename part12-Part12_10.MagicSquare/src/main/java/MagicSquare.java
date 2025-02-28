    
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> listOfRows = new ArrayList<>();
        for (int row = 0 ; row < this.square.length ; row++){
            int sum = 0;
            for (int column = 0 ; column < this.square[row].length ; column++){
                sum += this.square[row][column];
            }
            listOfRows.add(sum);
        }
        
        return listOfRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> listOfColumns = new ArrayList<>();
    
        // Verificar si la matriz está vacía
        if (this.square == null || this.square.length == 0) {
            return listOfColumns; // Devuelve una lista vacía si no hay filas
        }
    
        // Obtener el número de columnas (asumimos que todas las filas tienen el mismo número de columnas)
        int numColumns = this.square[0].length;
    
        // Recorrer cada columna
        for (int column = 0; column < numColumns; column++) {
            int sum = 0;
    
            // Recorrer cada fila dentro de la columna actual
            for (int row = 0; row < this.square.length; row++) {
                // Verificar si la fila tiene la columna actual
                if (column < this.square[row].length) {
                    sum += this.square[row][column];
                }
            }
    
            listOfColumns.add(sum); // Añadir la suma de la columna actual a la lista
        }
    
        return listOfColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> listOfDiagonals = new ArrayList<>();
        int sumPrimary = 0; // Suma de la diagonal principal
        int sumSecondary = 0; // Suma de la diagonal secundaria
    
        // Verificar si la matriz es cuadrada
        if (this.square == null || this.square.length == 0 || this.square.length != this.square[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada y no nula.");
        }
    
        int n = this.square.length; // Tamaño de la matriz (n x n)
    
        // Recorrer la matriz para sumar las diagonales
        for (int i = 0; i < n; i++) {
            sumPrimary += this.square[i][i]; // Diagonal principal
            sumSecondary += this.square[i][n - 1 - i]; // Diagonal secundaria
        }
    
        // Añadir las sumas a la lista
        listOfDiagonals.add(sumPrimary);
        listOfDiagonals.add(sumSecondary);
    
        return listOfDiagonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
