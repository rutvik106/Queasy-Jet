import java.util.ArrayList;
import java.util.List;

public class Aircraft {

	private double totalPassengerWeight = 0.0;
	private double revenue = 0.0;
	private int maximumPassengers;
	private double maximumWeight;
	private final String route;

	private final List<Passenger> passengers;

	public Aircraft(String route) {
		this.route = route;
		this.passengers = new ArrayList<>();
		setMaxPassengersAndMaxWeight();
	}

	private void setMaxPassengersAndMaxWeight() {
		if (route.equals(Route.CAPE_TOWN)) {
			maximumPassengers = Route.CAPE_TOWN_MAX_PASSENGERS;
			maximumWeight = Route.CAPE_TOWN_MAXIMUM_WEIGHT;
		} else if (route.equals(Route.GLASGOW)) {
			maximumPassengers = Route.GLASGOW_MAX_PASSENGERS;
			maximumWeight = Route.GLASGOW_MAXIMUM_WEIGHT;
		}
	}

	public String listPassengers() {
		String passengerDetails = "";

		if (passengers.isEmpty()) {
			return "No Passengers in Aircraft";
		}

		for (Passenger p : passengers) {
			passengerDetails = passengerDetails + "\n" + p.toString() + "\n";
		}

		return passengerDetails+"\n";
	}

	public boolean addPassenger(Passenger newPassenger) {

		addPassengerWeightAndRevenue(newPassenger);

		if (passengers.size() < maximumPassengers && totalPassengerWeight < maximumWeight) {
			passengers.add(newPassenger);
			return true;
		}

		return false;
	}

	private void addPassengerWeightAndRevenue(Passenger newPassenger) {
		totalPassengerWeight = totalPassengerWeight + newPassenger.getWeight();
		revenue=revenue+((Chargeable)newPassenger).calculateCharges();
	}

	private void removePassengerWeightAndRevenue(Passenger removedPassenger) {
		totalPassengerWeight = totalPassengerWeight - removedPassenger.getWeight();
		revenue=revenue-((Chargeable)removedPassenger).calculateCharges();
	}

	public Passenger findPassenger(int passengerNo) {
		for (Passenger p : passengers) {
			if (p.getPassengerNumber() == passengerNo) {
				return p;
			}
		}
		return null;
	}

	public boolean removePassenger(int passengerNo) {

		Passenger foundPassenger = null;

		for (Passenger p : passengers) {
			if (p.getPassengerNumber() == passengerNo) {
				foundPassenger = p;
			}
		}

		if (foundPassenger != null) {
			removePassengerWeightAndRevenue(foundPassenger);
			return passengers.remove(foundPassenger);
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Route: " + route + "\nMaximum Passengers: " + maximumPassengers + "\nMaximum Weight: " + maximumWeight
				+ "\nTotal Passengers: " + passengers.size() + "\nTotal Passenger Weight: " + totalPassengerWeight
				+ "\nRevenue: " + revenue;
	}

}
