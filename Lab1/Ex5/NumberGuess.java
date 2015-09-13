import java.lang.Math;
import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		int rdNumber = (int) (Math.random() * 98 + 1);
		System.out.println(rdNumber);
		run(rdNumber);
	}

	public static boolean checkNumber(int number, int rdNumber) {
		boolean check = false;
		if (number > rdNumber) {
			System.out.println("Try lower");
		}

		if (number < rdNumber) {
			System.out.println("Try higher");
		}

		if (number == rdNumber) {
			System.out.println("Exactly");
			check = true;
		}
		
		return check;
	}

	public static void run(int rdNumber) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first Number: ");
		num1 = sc.nextInt();
		if (checkNumber(num1, rdNumber)) {
			System.out.println("Congratulations!");
			return;
		}
		System.out.print("Enter the second Number: ");
		num2 = sc.nextInt();
		if (checkNumber(num2, rdNumber)) {
			System.out.println("Congratulations!");
			return;
		}
		System.out.print("Enter the third Number: ");
		num3 = sc.nextInt();
		if (checkNumber(num3, rdNumber)) {
			System.out.println("Congratulations!");
			return;
		}
		
		System.out.println("Random number: " + rdNumber);
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
		System.out.println("Third number: " + num3);
		
	}
}
