
public class BookingAdmin {

	Aircraft aircraft;

	public Aircraft getAircraft() {
		return aircraft;
	}
	
	public BookingAdmin(){
		setupAdmin();
	}

	private void setupAdmin() {

		aircraft = new Aircraft(Route.GLASGOW);
		
		EconomyPassenger ep1=new EconomyPassenger("Rutvik", "Mehta", 52,Economy.GLASGOW_BASE_FARE);
		ep1.setLuggage(18.3);
		
		EconomyPassenger ep2=new EconomyPassenger("Neel", "Mistry", 65,Economy.GLASGOW_BASE_FARE);
		ep1.setLuggage(20.2);
		
		EconomyPassenger ep3=new EconomyPassenger("Rakshit", "Sathwara", 55,Economy.GLASGOW_BASE_FARE);
		ep1.setLuggage(13.4);
		
		EconomyPassenger ep4=new EconomyPassenger("Rushil", "Patel", 58,Economy.GLASGOW_BASE_FARE);
		ep1.setLuggage(17.6);
		
		aircraft.addPassenger(ep1);
		aircraft.addPassenger(ep2);
		aircraft.addPassenger(ep3);
		aircraft.addPassenger(ep4);


	}

}
