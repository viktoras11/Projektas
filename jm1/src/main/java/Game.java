import java.util.Random;
import java.util.Scanner;



public class Game  {

    public Scanner input = new Scanner(System.in); // input scanner
    public Random rand = new Random();              // random input

    public void createBoard(String[][] seaMap) {
        System.out.println("");
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        System.out.println("   ____________________");
        for (int i = 0; i < seaMap.length; ++i) {
            System.out.print(i + " |");
            for (int j = 0; j < seaMap[i].length; ++j) {
                String tmp = seaMap[i][j];
                System.out.print("" + tmp + " ");
            }
            System.out.println("| ");
        }
        System.out.println("   ____________________");
        System.out.println("");
    }

    public void battle(String[][] computerMap, String[][] playerMap){

        int playerShipCount = 5, computerShipCount = 5;
        int x1, y1;                                                           // zaidejo koordinates

        while(playerShipCount > 0 && computerShipCount > 0) {
            System.out.println("JŪSŲ ĖJIMAS");
            System.out.print("IVESKITE X KOORDINATĘ: ");        // X koordinates ivedimas
            x1 = input.nextInt();
            while (x1 < 0 || x1 > 9) {
                System.out.println("NETINKAMA KOORDINATĖ!");
                System.out.print("IVESKITE X KOORDINATĘ: ");
                x1 = input.nextInt();
            }

            System.out.print("IVESKITE Y KOORDINATĘ: ");           // Y koordinates ivedimas
            y1 = input.nextInt();
            while (y1 < 0 || y1 > 9) {
                System.out.println("NETINKAMA KOORDINATĖ!");
                System.out.print("IVESKITE Y KOORDINATĘ: ");
                y1 = input.nextInt();
            }

            if(computerMap[y1][x1].equals("S")){
                System.out.println("TU NUSKANDINAI LAIVA!");
                playerMap[y1][x1] = "!";
                --computerShipCount; //mazejantis kompiuterio laivu skaicius.
            }else if(playerMap[y1][x1].equals("S")){
                System.out.println("TU NUSKANDINAI SAVO LAIVA!");
                playerMap[y1][x1] = "x";
                --playerShipCount; //mazejantis zaidejo laivu skaicius.
            }else if(playerMap[y1][x1].equals(" ")){
                System.out.println("TU NEPATAIKEI!");
                playerMap[y1][x1] = "-";
            }else{
                System.out.println("ŠI POZICIJA JAU UŽIMTA!");
                continue;
            }
            createBoard(playerMap); /*Spauzdiname zemelapi po zaidejo kiekvieno ejimo*/
            System.out.println("TAVO LAIVAI: " + playerShipCount + " | KOMPIUTERIO LAIVAI: " + computerShipCount);
            System.out.println("-----------------------------");

            System.out.println("KOMPIUTERIO EILE");
            int x2, y2; /*spejamos kompiuterio koordinates*/

            x2=rand.nextInt(10);
            y2=rand.nextInt(10);
            while(playerMap[y2][x2].equals("x") || playerMap[y2][x2].equals("!") || computerMap[y2][x2].equals("-")){
                x2=rand.nextInt(10);
                y2=rand.nextInt(10);
            }
            if(playerMap[y2][x2].equals("S")){
                System.out.println("KOMPIUTERIS NUSKANDINO TAVO LAIVA!");
                playerMap[y2][x2] = "x";
                --playerShipCount; //mazejantis zaidejo laivu skaicius.
            }else if(computerMap[y2][x2].equals("S")){
                System.out.println("KOMPIUTERIS NUSKANDINO SAVO LAIVA!");
                playerMap[y2][x2] = "!";
                --computerShipCount; //mazejantis kompiuterrio laivu skaicius.
            }
            else if(computerMap[y2][x2].equals(" ")){
                System.out.println("KOMPIUTERIS NEPATAIKE");
                computerMap[y2][x2] = "-";
            }
            createBoard(playerMap); /*spauzdiname zemelapi po kompiuterio ejimo*/
            System.out.println("TAVO LAIVAI: " + playerShipCount + " | KOMPIUTERIO LAIVAI: " + computerShipCount);
            System.out.println("-----------------------------");
        }
    }

}
