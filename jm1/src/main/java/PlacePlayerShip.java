import java.util.Scanner;



public class PlacePlayerShip {

    public Scanner input = new Scanner(System.in);

    // Siuo metodu sukuriame 5 zaidejo laivus

    public void placePlayerShips(String[][] playerMap) {
        int x, y;
        System.out.println("SURYKIUOKITE SAVO LAIVUS:");
        int i = 1;
        while(i <= 5){
            System.out.print("ĮVESKITE  " + i + " LAIVO X KOORDINATĘ: ");
            x = input.nextInt();
            while (x < 0 || x > 9) {                    /*jeigu suvedame per dideli skaiciu*/
                System.out.println("NETINKAMA KOORDINATĖ!");
                System.out.print("ĮVESKITE " + i + " LAIVO X KOORDINATĘ: ");
                x = input.nextInt();
            }

            System.out.print("ĮVESKITE " + i + " LAIVO Y KOORDINATĘ: ");
            y = input.nextInt();
            while (y < 0 || y > 9) {
                System.out.println("NETINKAMA KOORDINATĖ!");
                System.out.print("ĮVESKITE " + i + " LAIVO Y KOORDINATĘ: ");
                y = input.nextInt();
            }

            if(playerMap[y][x].equals("S")) {
                System.out.println("ŠI POZICIJA JAU UŽIMTA!");
                continue;
            }
            playerMap[y][x] = "S";
            ++i;
        }
    }
}
