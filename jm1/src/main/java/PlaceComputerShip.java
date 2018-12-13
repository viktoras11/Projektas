import java.util.Random;


public class PlaceComputerShip {

    public Random rand = new Random();

    //* siuo metodu sukuriame 5 kompiuterio laivus.

    public void placeComputerShips(String[][] computerMap, String[][] playerMap){
        int x, y;
        System.out.println("KOMPIUTERIS IŠDĖSTO SAVO LAIVUS");
        int i = 1;
        while (i <= 5) {
            x = rand.nextInt(10); //Sugeneruojame atsitiktini skaiciu
            y = rand.nextInt(10);
            if (playerMap[y][x].equals("S") || computerMap[y][x].equals("S")) {
                continue;
            }
            computerMap[y][x] = "S";
            System.out.println(i + ". Parinkta laivo vieta.");
            ++i;

        }


    }
}
