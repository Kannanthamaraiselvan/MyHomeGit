package com.home.classtutorial;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setDoors("Closed");
		fourWheeler.setDriver("available");
		fourWheeler.setEngine("on");
		fourWheeler.setSpeed(10);
		
		
		
		Car car = new Car();
		car.setName("Audi");
		car.setCost(9000000);
		fourWheeler.setCar(car);

		System.out.println(fourWheeler.getFourWheeler());

		System.out.println(" \n" + car.getCars());
		
		System.out.println(" \n" + fourWheeler.toString());

	}

}
