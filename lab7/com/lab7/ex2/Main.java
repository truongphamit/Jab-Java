package com.lab7.ex2;

public class Main {
	public static void main(String[] args) {
		ResizableCircle resizableCircle = new ResizableCircle(5);
		System.out.println("Current radius: " + resizableCircle.getRadius());
		System.out.println("Perimeter: " + resizableCircle.getPerimeter());
		System.out.println("Area: " + resizableCircle.getArea());
		resizableCircle.resize(3);
		System.out.println("Current radius: " + resizableCircle.getRadius());
		System.out.println("Perimeter: " + resizableCircle.getPerimeter());
		System.out.println("Area: " + resizableCircle.getArea());
	}
}
