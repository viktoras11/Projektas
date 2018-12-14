import java.util.Random;


public class PlaceComputerShip {

    public Random rand = new Random();

    //* siuo metodu sukuriame 5 kompiuterio laivus.

    public void placeComputerShips(String[][] computerMap, String[][] playerMap){
        int x, y;
        SysOut3 sysOut3 = new SysOut3();

        sysOut3.pcs1();
        int i = 1;
        while (i <= 5) {
            x = rand.nextInt(10); //Sugeneruojame atsitiktini skaiciu
            y = rand.nextInt(10);
            if (playerMap[y][x].equals("S") || computerMap[y][x].equals("S")) {
                continue;
            }
            computerMap[y][x] = "S";
            System.out.print(i + ". Pasirinkta laivo vieta.\n");;
            ++i;

        }


    }
}
