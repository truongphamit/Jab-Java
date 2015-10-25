package com.lab7.ex1;

public class Main {
	public static void main(String[] args) {
		MovableObject object = new MovableRectangle(-1, 1, 1, -1, 0, 0);
		System.out.println("Rectangle");
		move(object);
		
		System.out.println("\nCircle");
		object = new MovableCircle(0, 0, 0, 0, 1);
		move(object);
	}
	
	public static void move(MovableObject object) {
		System.out.println("Start");
		System.out.println(object);
		System.out.println("Up");
		object.moveUp();
		System.out.println(object);
		System.out.println("Down");
		object.MoveDown();
		System.out.println(object);
		System.out.println("Left");
		object.MoveLeft();
		System.out.println(object);
		System.out.println("Right");
		object.MoveRight();
		System.out.println(object);
	}
}
