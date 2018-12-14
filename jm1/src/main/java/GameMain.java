


public class GameMain {

    public static void main(String[] args) {
        /*PATEIKIAME 10 x 10 seaMap, kiekviena karta vis nauja */
        String[][] playerMap = new String[10][10];
        String[][] computerMap = new String[10][10];


        /*PASISVEIKINIMOM ZINUTE*/
        System.err.println("   **** JŪRŲ MŪŠIS ****");


        ElementsEmpty elementsEmpty = new ElementsEmpty();
        Game game = new Game();
        PlaceComputerShip computerShip = new PlaceComputerShip();
        PlacePlayerShip playerShip = new PlacePlayerShip();

        elementsEmpty.empty(playerMap, computerMap);
        game.createBoard(playerMap);
        playerShip.placePlayerShips(playerMap);
        game.createBoard(playerMap);
        computerShip.placeComputerShips(computerMap, playerMap);
        game.battle(computerMap, playerMap);
    }
}