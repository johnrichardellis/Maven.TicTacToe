package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] matrix;

    public Board(Character[][] matrix) {         // constructor

        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        for (int row = 0; row < matrix.length; row++) {
            int rowCounter = 0;
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 'X') {
                    rowCounter = rowCounter + 1;
                    for (int i = 0; i < matrix.length; i++) {
                        Character[] characters = matrix[i];
                    }
                }

            }

            if (rowCounter == 3) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            int colCounter = 0;
            for (int row = 0; row < 3; row++) {
                if (matrix[row][col] == 'X') {
                    colCounter = colCounter + 1;
                }
            }
            if (colCounter == 3) {
                return true;
            }
        }

        if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
            return true;
        }

        if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X') {
            return true;
        }

        return false;
    }


    public Boolean isInFavorOfO() {    // same as above, replace o with x
        for (int row = 0; row < matrix.length; row++) {
            int rowCounter = 0;
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 'O') {
                    rowCounter = rowCounter + 1;
                    for (int i = 0; i < matrix.length; i++) {
                        Character[] characters = matrix[i];
                    }
                }

            }

            if (rowCounter == 3) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            int colCounter = 0;
            for (int row = 0; row < 3; row++) {
                if (matrix[row][col] == 'O') {
                    colCounter = colCounter + 1;
                }
            }
            if (colCounter == 3) {
                return true;
            }
        }

        if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
            return true;
        }

        if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O') {
            return true;
        }

        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        String winner = "";

        if (isInFavorOfX()) {
            winner = "X";
        }

        if (isInFavorOfO()) {
            winner = "O";
        }

        return winner;
    }

}
