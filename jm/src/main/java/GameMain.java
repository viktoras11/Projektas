public class GameMain {

    public static void main(String[] args) {

        String[][] board = new String[10][10];
        Board.createBoard(board);
        //Ship.showBoard(board);     // TARKIM PIRMO ZAIDEJO LAIVAI ???? KAZIN AR IS VISO REIKAI. GAL PADARYTI TIK ISMETAMAVIENA LAUKA AKTYVIAM ZAIDEJUI
        Ship.createShip(board, 4);
        Board.showBoard(board);     // PIRMO ZAIDEJO MUSIO LAUKAS
    }




}
