package com.lab7.ex1;

public class MovableRectangle implements MovableObject{
	private MovablePoint topLeft;
	private MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int dx, int dy) {
		topLeft = new MovablePoint(x1, y1, dx, dy);
		bottomRight = new MovablePoint(x2, y2, dx, dy);
	}

	public MovablePoint getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(MovablePoint topLeft) {
		this.topLeft = topLeft;
	}

	public MovablePoint getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(MovablePoint bottomRight) {
		this.bottomRight = bottomRight;
	}

	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	@Override
	public void MoveDown() {
		topLeft.MoveDown();
		bottomRight.MoveDown();
	}

	@Override
	public void MoveLeft() {
		topLeft.MoveLeft();
		bottomRight.MoveLeft();
	}

	@Override
	public void MoveRight() {
		topLeft.MoveRight();
		bottomRight.MoveRight();
	}
	
	@Override
	public String toString() {
		return "Top left: " + topLeft + ", Bottom right: " +  bottomRight;
	}
	
}
