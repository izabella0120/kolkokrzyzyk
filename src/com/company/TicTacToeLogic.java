package com.company;

public class TicTacToeLogic {

    private final int SIZE = 3; //final
    private final String x = "x";
    private final String o = "o";
    private final String empty = "-";
    String[][] board;

    public TicTacToeLogic() {
        init();

    }

    private void init() {
        board = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = "-";

            }


        }


    }

    public void printBoard() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean move(String symbol, int rowIndex, int columnIndex) {
        if ((symbol.equals(x) || symbol.equals(o)) && board[rowIndex][columnIndex] (empty)){
            board[rowIndex][columnIndex] = symbol;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFinished() {


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((board[i][j] == board[i][j + 1]) && (board[i][j] == board[i][j + 2]))
                    return true;
                else if ((board[i][j] == board[i + 1][j]) && (board[i][j] == board[i + 2][j]))
                    return true;
                else if (board[i][j] == "-")
                    return false;


            }

        }

    }

}
