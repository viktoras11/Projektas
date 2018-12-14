

public class ElementsEmpty {

    public void empty(String[][] computerMap, String[][] playerMap) {

        /*initializing the map elements to empty*/
        for (int i = 0; i < playerMap.length; ++i) {
            for (int j = 0; j < playerMap[i].length; ++j) {
                playerMap[i][j] = " ";
                computerMap[i][j] = " ";
            }
        }
    }
}


