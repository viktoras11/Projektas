


public class GameMain {

    public static void main(String[] args) {
        /*PATEIKIAME 10 x 10 seaMap, kiekviena karta vis nauja */
        String[][] playerMap = new String[10][10];
        String[][] computerMap = new String[10][10];
        /*initializing the map elements to empty*/
        for (int i = 0; i < playerMap.length; ++i) {
            for (int j = 0; j < playerMap[i].length; ++j) {
                playerMap[i][j] = " ";
                computerMap[i][j] = " ";
            }
        }
        /*PASISVEIKINIMOM ZINUTE*/
        System.err.println("   **** JŪRŲ MŪŠIS ****");

        Game game = new Game();
        PlaceComputerShip computerShip = new PlaceComputerShip();
        PlacePlayerShip playerShip = new PlacePlayerShip();


        game.createBoard(playerMap);
        playerShip.placePlayerShips(playerMap);
        game.createBoard(playerMap);
        computerShip.placeComputerShips(computerMap, playerMap);

        game.battle(computerMap, playerMap);
    }
}