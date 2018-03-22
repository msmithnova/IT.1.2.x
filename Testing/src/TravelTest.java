import static org.junit.Assert.*;

import org.junit.Test;

public class TravelTest {

	@Test
	public void testNotEnoughFuelForTravel() {
		FuelTank tank = new FuelTank(40, 15);
		Car car = new Car(tank, 0.09);
		double km = 250.0;
		GasStation gasStation = new GasStation(0.8, 1.0);
		double remainingKm = car.travel(km);
		double cost = gasStation.refuel(car, remainingKm);
		System.out.println("Remaining KM: " + String.format("%.2f", remainingKm) + ", Cost to refuel: $"
				+ String.format("%.2f", cost));
	}

}
