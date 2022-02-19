package dz;
public class Handler {

	public static void main(String[] args) {
		Driver shy = new Driver("Shy", new Car(false, "Audi A4"));
		displayCarCondition(shy);
		shy.car.breakCar();
		displayCarCondition(shy);
		shy.repairCar();
		displayCarCondition(shy);
		shy.car.breakCar();
		displayCarCondition(shy);
		AutoServiceStation.repairCar(shy.car);
		displayCarCondition(shy);
	}
	static void displayCarCondition(Driver driver) {
		System.out.println(driver.name+"'s "+driver.car.model+" is "+driver.car.carCondition());
	}
}

class Car {
	boolean isBroken;
	String model;
	double price;
	double weight;
	double speed;
	Car() {}
	Car(boolean condition, String modelOfCar) {
		isBroken = condition;
		model = modelOfCar;
	}
	void breakCar() {
		if(!isBroken) {
			isBroken=!isBroken;
		}
	}
	String carCondition() {
		return !isBroken?"repaired":"broken";
	}
}

class Driver {
	String name;
	Car car;
	Driver() {}
	Driver(String driversName, Car driversCar) {
		car = driversCar;
		name = driversName;
	}
	void repairCar() {
		if(car.isBroken) {
			car.isBroken=!car.isBroken;
		}
	}
	String carCondition() {
		return car.carCondition();
	}
}

class AutoServiceStation {
	static void repairCar(Car car) {
		System.out.println("Preliminary actions");
		if(car.isBroken) {
			car.isBroken=!car.isBroken;
		}
	}
}
