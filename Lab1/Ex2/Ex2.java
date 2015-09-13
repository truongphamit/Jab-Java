import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		char beginChar;
		char endChar;
		int numberPerLine;
		Scanner sc = new Scanner(System.in);
		beginChar = sc.next().charAt(0);
		endChar = sc.next().charAt(0);
		numberPerLine = sc.nextInt();
		showResult(beginChar, endChar, numberPerLine);
	}

	public static void showResult(char beginChar, char endChar, int numberPerLine) {
		int count = 0;		
		for (char index = beginChar; index <= endChar; index++) {
			if (count < numberPerLine) {
				System.out.print(index);
				++count;
			} else {
				System.out.println();	
				System.out.print(index);
				count = 1;
			}
		}
		System.out.println();
	}
}
