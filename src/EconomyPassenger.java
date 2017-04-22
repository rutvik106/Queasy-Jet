
public class EconomyPassenger extends PayingPassenger implements Economy {

	public EconomyPassenger(String firstName, String lastName, double weight, double baseFare) {
		super(Economy.TYPE_CHARGE, Economy.START_NUMBER, firstName, lastName, weight, baseFare);
	}

	@Override
	public String toString() {
		return "This is an Economy Passenger " + super.toString();
	}

}