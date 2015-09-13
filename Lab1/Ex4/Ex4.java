import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int a, b;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.print("> java Arithmetic ");
		a = sc.nextInt();
		b = sc.nextInt();
		operator = sc.next().charAt(0);
		execute(a, b, operator);
	}
	
	public static void execute(int a, int b, char operator) {
		switch (operator) {
			case '+' :  
				System.out.println(a + " " + operator + " " + b + " = " + (a+b));
				break;
			case '-' : 
				System.out.println(a + " " + operator + " " + b + " = " + (a-b));
				break;
			case '*' : 
				System.out.println(a + " " + operator + " " + b + " = " + (a*b));
				break;
			case '/' : 
				System.out.println(a + " " + operator + " " + b + " = " + (a/b));
				break;
		}
	}
}
