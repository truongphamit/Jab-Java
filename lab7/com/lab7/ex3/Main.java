package com.lab7.ex3;

public class Main {
	public static void main(String[] args) {
		IsVehicle[] myArray = new IsVehicle[4];
		myArray[0] = new Jeep();
		myArray[1] = new Hovercraft();
		myArray[2] = new Frigate();
		myArray[3] = new PoliceCar();
		for (IsVehicle n : myArray) {
			ringPoliceCar(n);
		}
	}

	public static void ringPoliceCar(IsVehicle vehicle) {
		if (vehicle instanceof PoliceCar) {
			((PoliceCar) vehicle).soundSiren();
		} else {
			System.out.println("It is not Police car");
		}
	}
}
