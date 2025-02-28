public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        int[][] magicSquare = new int[size][size];
        
        int number = 1;
        int row = 0;
        int col = size / 2;
        
        while (number <= size * size) {
            // Place current number
            magicSquare[row][col] = number++;
            
            // Save current position
            int currentRow = row;
            int currentCol = col;
            
            // Move diagonally up-right
            row = (row - 1 + size) % size;
            col = (col + 1) % size;
            
            // If cell is occupied, move down from previous position
            if (magicSquare[row][col] != 0) {
                row = (currentRow + 1) % size;
                col = currentCol;
            }
        }
        
        // Transfer values to MagicSquare object
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square.placeValue(i, j, magicSquare[i][j]);
            }
        }
        
        return square;
    }

}
