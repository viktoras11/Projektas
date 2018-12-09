import java.util.Scanner;



public class Game  {

    public Scanner input = new Scanner(System.in); // scanner objektas

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

        int playerShipCount = 1, computerShipCount = 1;
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

        }
    }

}
