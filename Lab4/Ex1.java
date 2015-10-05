import java.util.Scanner;

public class Ex1 {
	final static char result[] = {'B', 'C', 'D', 'B', 'A', 'D', 'C', 'D', 'A', 'B'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		caculate(sc);
	}

	public static void caculate(Scanner sc) {
		int sum = 0;
		char value[] = new char[result.length];
		System.out.println("Nhap " + result.length + " cau tra loi: ");
		for (int i = 0; i < result.length; i++) {
			value[i] = sc.next().charAt(0);
			if (value[i] == result[i]) ++ sum;
		}
		System.out.println("Dap an: ");
		System.out.println(result);
		System.out.println("Cau tra loi cua thi sinh: ");
		System.out.println(value);
		System.out.println("Diem: " + sum);
	}
}