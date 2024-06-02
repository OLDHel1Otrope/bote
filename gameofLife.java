public class gameofLife {
    static int countNeighbours(int[][] arr, int i, int j) {
        int val = 0;
        int[][] directions = {
          {-1, -1}, 
          {-1, 0}, 
          {-1, 1},
          {0, -1},
          {0, 1},
          {1, -1}, 
          {1, 0}, 
          {1, 1}
        };
        
        for (int[] direction : directions) {
            int newX = i + direction[0];
            int newY = j + direction[1];
            if (newX >= 0 && newX < arr.length && newY >= 0 && newY < arr[0].length) {
                val += arr[newX][newY];
            }
        }
        return val;
    }

    static void gol(int[][] board){
        int rows = board.length;
        int cols = board[0].length;
        int[][] binaryArray2 = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int neighbours = countNeighbours(board, i, j);
                if (board[i][j] == 1) {
                    if (neighbours < 2 || neighbours > 3) {
                        binaryArray2[i][j] = 0;
                    } else {
                        binaryArray2[i][j] = 1;
                    }
                } else {
                    if (neighbours == 3) {
                        binaryArray2[i][j] = 1;
                    } else {
                        binaryArray2[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = binaryArray2[i][j];
            }
        }
    }
}
