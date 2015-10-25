package com.lab7.ex1;

public class MovableCircle implements MovableObject{
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int dx, int dy, int radius) {
		this.radius = radius;
		center = new MovablePoint(x, y, dx, dy);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MovablePoint getCenter() {
		return center;
	}

	public void setCenter(MovablePoint center) {
		this.center = center;
	}

	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void MoveDown() {
		center.MoveDown();
	}

	@Override
	public void MoveLeft() {
		center.MoveLeft();
	}

	@Override
	public void MoveRight() {
		center.MoveRight();
	}
	
	@Override
	public String toString() {
		return "Center: " + center + ", Radius = " + radius;
	}

}
