
public abstract class Passenger implements Weighable {

	public static int ID_SEQUENCE = 0;

	private final int passengerNumber;

	private final String firstName, lastName;

	private double weight;

	private double luggage = 0.0;

	public Passenger(int passengerNumberStart, String firstName, String lastName, double weight) {
		this.passengerNumber = passengerNumberStart + Passenger.ID_SEQUENCE;
		ID_SEQUENCE++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setWeight(weight);
	}

	public int getPassengerNumber() {
		return passengerNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getWeight() {
		return weight + getLuggage();
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLuggage() {
		return luggage;
	}

	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}

	@Override
	public String toString() {
		return "ID SEQUENCE: " + ID_SEQUENCE + "\nPassenger No: " + getPassengerNumber() + "\nFirst Name: "
				+ getFirstName() + "\nLast Name: " + getLastName() + "\nTotal Weight: " + getWeight();
	}

}
