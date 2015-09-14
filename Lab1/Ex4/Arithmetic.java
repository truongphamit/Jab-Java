import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char operator = args[2].charAt(0);
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
