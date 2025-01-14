package com.lab7.ex1;

public class MovablePoint implements MovableObject{
	private int x;
	private int y;
	private int dx;
	private int dy;
	
	public MovablePoint(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}
	
	@Override
	public void moveUp() {
		y += 1;	
	}

	@Override
	public void MoveDown() {
		y -= 1;
	}

	@Override
	public void MoveLeft() {
		x -= 1;
	}

	@Override
	public void MoveRight() {
		x += 1;
	}
	
	@Override
	public String toString() {
		return "(x, y) = " + "(" + x + "," + y + ")";  
	}
}
