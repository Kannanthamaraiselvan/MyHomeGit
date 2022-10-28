package com.home.classtutorial;

public class FourWheeler {

	private String doors;
	private String driver;
	private String engine;
	private int speed;
	private Car car;

	// Generated Getters and setters.
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	// manually written getters and setters
	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getDoors() {
		return doors;
	}

	public String getFourWheeler() {
		if (doors.equals("Closed") && speed > 0 && driver.equals("available") && engine.equals("on")) {
			return "Four wheeler Running";
		} else {
			return "Four Wheeler Not running";
		}
	}

	@Override
	public String toString() {
		return "FourWheeler [doors=" + doors + ", driver=" + driver + ", engine=" + engine + ", speed=" + speed
				+ ", car= [" + car.getCars() +"] ]";
	}
}
