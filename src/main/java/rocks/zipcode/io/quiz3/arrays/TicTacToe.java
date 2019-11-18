package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] xO = new String[3][3];

    public TicTacToe(String[][] board) {
        this.xO = board;
    }

    public TicTacToe() {
    }
//something wrong with test 1
    public String[] getRow(Integer value) {

        String[] result = new String[3];

       if(value == 0) {
           for (int i = 0; i < 3; i++) {
               result[i] = xO[i][0];
           }
           return result;
       }
        if(value == 1) {
            for (int i = 0; i < 3; i++) {
                result[i] = xO[i][0];
            }
            return result;
        }
        if(value == 2) {
            for (int i = 0; i < 3; i++) {
                result[i] = xO[i][0];
            }
        }

        return result;
    }

    public String[] getColumn(Integer value) {

            String[] result = new String[3];

            if (value == 0) {
                for (int i = 0; i < 3; i++) {
                    result[i] = xO[0][i];
                }
            }
            if (value == 1) {
                for (int i = 0; i < 3; i++) {
                    result[i] = xO[0][i];
                }
            }
            if (value == 2) {
                for (int i = 0; i < 3; i++) {
                    result[i] = xO[0][i];
                }
            }

            return result;
        }

    public Boolean isRowHomogenous(Integer rowIndex) {

        for (int row = rowIndex; row < xO.length; row++) {
            if (xO[rowIndex][0].equals(xO[rowIndex][1]) && xO[rowIndex][0].equals(xO[rowIndex][2]) && (!xO[rowIndex][0].equals(' '))) {
                return true;
            }
        }
        return false;
    }


    public Boolean isColumnHomogeneous(Integer columnIndex) {

        for (int col = columnIndex; col < xO.length; col++) {
            if (xO[0][columnIndex].equals(xO[1][columnIndex]) && xO[0][columnIndex].equals(xO[2][columnIndex]) && (!xO[0][columnIndex].equals(' '))) {
                return true;
            }
        }
        return false;
    }

    public String getWinner() {


        return null;
    }

    public String[][] getBoard() {
        return xO;
    }
}
