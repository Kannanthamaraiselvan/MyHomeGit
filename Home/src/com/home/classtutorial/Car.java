package com.home.classtutorial;

public class Car {
	
	private String name;


	private double cost;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public String getCars() {
		return "Car Name: " + name +
				"Car cost: " + cost;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", cost=" + cost + "]";
	}

}
