

public class PassengerTest {

	public static void main(String[] args) {
		
		BookingAdmin ba=new BookingAdmin();
		
		System.out.println("---AIRCRAFT DETAILS--------------------");
		System.out.println(ba.getAircraft().toString());
		System.out.println("---------------------------------------");
		System.out.println("\n");

		System.out.println("---PASSENGER DETAILS--------------------");
		System.out.println(ba.getAircraft().listPassengers());
		System.out.println("---------------------------------------");
		System.out.println("\n");		
		
		
	}
	
}
