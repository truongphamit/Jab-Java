package com.lab7.ex2;

public class Circle implements ResizableObject {
	public static final double PI = 3.14;
	protected double radius = 1;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * PI;
	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

}
