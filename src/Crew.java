
public class Crew extends Passenger {
	static final String CAPTAIN = "Captain";
	static final String FIRST_OFFICER = "First Officer";
	static final String CABIN_CREW = "Cabin Crew";

	final String position;

	public String getPosition() {
		return position;
	}

	public Crew(int passengerNumberStart, String firstName, String lastName, double weight, String position) {
		super(passengerNumberStart, firstName, lastName, weight);
		this.position = position;
	}

	@Override
	public String toString() {
		return "ID SEQUENCE: " + ID_SEQUENCE + "\nCrew No: " + getPassengerNumber() + "\nCrew Type: " + getPosition()
				+ "\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nTotal Weight: " + getWeight();
	}

}
