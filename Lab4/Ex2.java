import java.util.Scanner;

public class Ex2 {
	final static char result[] = {'B', 'C', 'D', 'B', 'A', 'D', 'C', 'D', 'A', 'B'};
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dap an: ");
		System.out.println(result);
		System.out.println("Nhap vao so luong thi sinh: ");
		n = sc.nextInt();
		caculate(n, sc);
	}
	
	public static void caculate(int n, Scanner sc) {
		Answer answers[] = new Answer[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh #" + i + ": " );
			answers[i] = getAnswer(sc);
		}
		System.out.println("Diem:");
		for (int i = 0; i < n; i++) {
			System.out.print("Thi sinh #" + i + ": ");
			System.out.println(answers[i].getScore() + "/" + result.length);
		}
	}
	
	public static Answer getAnswer(Scanner sc) {
		Answer answer;
		int sum = 0;
		char value[] = new char[result.length];
		for (int i = 0; i < result.length; i++) {
			value[i] = sc.next().charAt(0);
			if (value[i] == result[i]) ++ sum;
		}
		answer = new Answer(value, sum);
		return answer;
	}
}
