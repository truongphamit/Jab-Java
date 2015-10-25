package com.lab7.ex3;

public class PoliceCar implements IsLandVehicle, IsEmergency {
	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int numWheels;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getMaxPassengers() {
		return maxPassengers;
	}

	@Override
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public int getNumWheels() {
		return numWheels;
	}

	@Override
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	@Override
	public void drive() {
		System.out.println("Drive!");
	}

	@Override
	public void soundSiren() {
		System.out.println("soundSiren");
	}

}
