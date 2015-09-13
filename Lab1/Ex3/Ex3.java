import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Student firstSt = new Student();
		Student secondSt = new Student();
		Student thirdSt = new Student();

		System.out.println("Student #1,");
		setInforStudent(firstSt);
		System.out.println("Student #2,");
		setInforStudent(secondSt);
		System.out.println("Student #3,");
		setInforStudent(thirdSt);

		if (firstSt.compareTo(secondSt) == -1) swapStudents(firstSt, secondSt);
		if (firstSt.compareTo(thirdSt) == -1) swapStudents(firstSt, thirdSt);
		if (secondSt.compareTo(thirdSt) == -1) swapStudents(secondSt, thirdSt);
		
		System.out.println(firstSt);
		System.out.println(secondSt);
		System.out.println(thirdSt);
	}

	public static void setInforStudent(Student student) {
		String name;
		double score;
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Score: ");
		score = sc.nextInt();
		System.out.println();
		student.setName(name);
		student.setScore(score);
	}

	public static void swapStudents(Student st1, Student st2) {
		String name = st1.getName();
		double score = st1.getScore();
		st1.setName(st2.getName());
		st1.setScore(st2.getScore());
		st2.setName(name);
		st2.setScore(score);
	}
}
