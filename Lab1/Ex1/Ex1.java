import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao 3 so: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();		
		System.out.println("Max = " + findMaxNumber(num1, num2, num3));
	}
	
	public static int findMaxNumber(int num1, int num2, int num3) {
		int a = num1>num2?num1:num2;
		return (num3>a?num3:a);
	}
}
