package parkingLot;
import java.util.Scanner;

public class NumberScanner extends ParkingLot {
	
	private static Scanner input;

	public static void numberScanner(String args) {
	
	input = new Scanner(System.in);
	int number;
	String letter, sum;
	
	number = input.nextInt();
	letter = input.toString();
	
	sum = number + letter;
	System.out.print(sum);
			
	}
}
