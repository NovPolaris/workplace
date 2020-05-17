public class Test03 {
	
}

class Vehicle {
	private String brand;
	private String licensePlate;

	public Vehicle(String brand, String licensePlate) {
		this.brand = brand;
		this.licensePlate = licensePlate;
	}

	public double getSumRent(int days) {
		return 0;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}
}

class Car extends Vehicle {
	private String model;

	public Car(String brand, String licensePlate, String model) {
		super(brand, licensePlate);
		this.model = model;
	}

	@Override
	public double getSumRent(int days) {
		if (model.equals("两厢")) {
			return 300 * days;
		} else if (model.equals("三厢")) {
			return 350 * days;
		}
		
		return 500 * days;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}

class Bus extends Vehicle {
	private int seats;

	public Bus(String brand, String licensePlate, int seats) {
		super(brand, licensePlate);
		this.seats = seats;
	}

	@Override
	public double getSumRent(int days) {
		if (seats <= 16) {
			return 400 * days;
		}
		return 600 * days;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getSeats() {
		return this.seats;
	}
}