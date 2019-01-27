package parkingLot;

public class ParkingLot {
	
	public static void main (String[] args) {
		
		Vehicle[] floor = new Vehicle[10];
		
		floor[0] = new Vans();					// floor -2
		floor[1] = new Vans();					// floor -1
												// floor 0
		floor[2] = new Electric();              // floor 1
		floor[3] = new Electric();				// floor 2
		floor[4] = new CombustionEngine();		// floor 3
		floor[5] = new CombustionEngine();		// floor 4
		floor[6] = new CombustionEngine();		// floor 5
		floor[7] = new CombustionEngine();		// floor 6
		floor[8] = new CombustionEngine();		// floor 7
		floor[9] = new CombustionEngine();		// floor 8
	}

}
