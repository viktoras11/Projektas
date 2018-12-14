import java.util.Random;
import java.util.Scanner;

public class Game {

    public Scanner input = new Scanner(System.in); // input scanner
    public Random rand = new Random();              // random input

    public void createBoard(String[][] seaMap) {
        SysOut1 sysOut1 = new SysOut1();
        sysOut1.cb1();
        for (int i = 0; i < seaMap.length; ++i) {
            System.out.print(i + " |");
            for (int j = 0; j < seaMap[i].length; ++j) {
                String tmp = seaMap[i][j];
                System.out.print("" + tmp + " ");
            }
            System.out.println("| ");
        }
        sysOut1.cb2();
    }

    public void battle(String[][] computerMap, String[][] playerMap){

        int playerShipCount = 5, computerShipCount = 5;
        int x1, y1;                                                           // zaidejo koordinates
        SysOut1 sysOut1 = new SysOut1();
        while(playerShipCount > 0 && computerShipCount > 0) {

            sysOut1.bt1();
            x1 = input.nextInt();   // X koordinates ivedimas
            while (x1 < 0 || x1 > 9) {
                sysOut1.bt2();
                x1 = input.nextInt();
            }

           sysOut1.bt3();          // Y koordinates ivedimas
            y1 = input.nextInt();
            while (y1 < 0 || y1 > 9) {
                sysOut1.bt4();
                y1 = input.nextInt();
            }

            if(computerMap[y1][x1].equals("S")){
                sysOut1.bt5();
                playerMap[y1][x1] = "!";
                --computerShipCount; //mazejantis kompiuterio laivu skaicius.
            }else if(playerMap[y1][x1].equals("S")){
                sysOut1.bt6();
                playerMap[y1][x1] = "x";
                --playerShipCount; //mazejantis zaidejo laivu skaicius.
            }else if(playerMap[y1][x1].equals(" ")){
                sysOut1.bt7();
                playerMap[y1][x1] = "-";
            }else{
                sysOut1.bt8();
                continue;
            }
            createBoard(playerMap); /*Spauzdiname zemelapi po zaidejo kiekvieno ejimo*/
            System.out.println("TAVO LAIVAI: " + playerShipCount + " | KOMPIUTERIO LAIVAI: " + computerShipCount);

            sysOut1.bt9();
            int x2, y2; /*spejamos kompiuterio koordinates*/

            x2=rand.nextInt(10);
            y2=rand.nextInt(10);
            while(playerMap[y2][x2].equals("x") || playerMap[y2][x2].equals("!") || computerMap[y2][x2].equals("-")){
                x2=rand.nextInt(10);
                y2=rand.nextInt(10);
            }
            if(playerMap[y2][x2].equals("S")){
                sysOut1.bt10();
                playerMap[y2][x2] = "x";
                --playerShipCount; //mazejantis zaidejo laivu skaicius.
            }else if(computerMap[y2][x2].equals("S")){
                sysOut1.bt11();
                playerMap[y2][x2] = "!";
                --computerShipCount; //mazejantis kompiuterrio laivu skaicius.
            }
            else if(computerMap[y2][x2].equals(" ")){
                sysOut1.bt12();
                computerMap[y2][x2] = "-";
            }
            createBoard(playerMap); /*spauzdiname zemelapi po kompiuterio ejimo*/
            System.out.println("TAVO LAIVAI: " + playerShipCount + " | KOMPIUTERIO LAIVAI: " + computerShipCount);
            System.out.println("-----------------------------");
        }
    }

}
