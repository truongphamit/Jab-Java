package com.lab7.ex3;

public class Frigate implements IsSeaVessel{
	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int displacement;
	
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
	public int getDisplacement() {
		return displacement;
	}

	@Override
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	@Override
	public void launch() {
		System.out.println("Launch!");
	}

}
