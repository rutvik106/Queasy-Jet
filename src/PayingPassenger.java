
public abstract class PayingPassenger extends Passenger implements Chargeable {

	private final double baseFare;

	private final double typeCharges;

	public PayingPassenger(double typeCharges, int passengerNumberStart, String firstName, String lastName,
			double weight, double baseFare) {
		super(passengerNumberStart, firstName, lastName, weight);
		this.typeCharges = typeCharges;
		this.baseFare = baseFare;
	}

	@Override
	public double calculateCharges() {
		return baseFare + (getWeight() * typeCharges);
	}

}
