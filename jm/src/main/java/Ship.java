


public class Ship {

        public static void createShip(String[][] board,int size) {      //Sukuriam laiva ir atsitiktine random metom ji po lauka

            if(Math.random() < 0.5) {                   // Math.random < 1 (1 not included)

                int col = (int)(Math.random()*5);      // int random
                int row = (int)(Math.random()*7);

                for(int i = 0; i < size; i++){
                    board[row][col+i] = "S";
                }
            }
            else {

                int col = (int)(Math.random()*7);       // int random 9 S ismeta uz sukortos lenteles ribu (error)
                int row = (int)(Math.random()*5);

                for(int i = 0; i < size; i++) {
                    board[row+i][col] = "S";
                }
            }
        }

}



