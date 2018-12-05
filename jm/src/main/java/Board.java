

public class Board {

    public static final boolean tmp = false;

    public static void breakln() {
        System.out.println("_____________________");
        System.out.println("");

    }

    public static void createBoard(String [][] board) {
        for (int i = 0; i < board.length; i++)              // Array su ciklas cikle, turi me lauka
        {
            for (int j = 0; j < board[0].length; j++)
            {
                board[i][j] = "-";                          // kad matyciau musio lauka
            }
        }
    }

    public static void showBoard(String[][] board) {

        breakln();
        for(int i = 0; i < board.length; i++) {

            if(tmp == true) {

                for(int j = 0; j < board[0].length; j++) {
                    System.out.print(" "+board[i][j]);
                }
                System.out.println("");
            }
            else {

                for(int j = 0; j < board[0].length; j++) {      // ant virsaus uzmetam bet koti simboli, kad pasleptume

                    if(board[i][j].equals("S")) {
                        System.out.print(" "+"L");
                    }
                    else {
                        System.out.print(" "+board[i][j]);
                    }
                }
                System.out.println("");
            }
        }
        breakln();
    }

}
