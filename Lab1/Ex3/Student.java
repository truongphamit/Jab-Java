public class Student {
	private String name;
	private double score;
	
	public Student() {

	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return this.score;
	}

	public int compareTo(Student student) {
		int result = 0;
		if (score > student.getScore()) result = 1;
		if (score < student.getScore()) result = -1;
		return result;
	}

	@Override
	public String toString() {
		return name + " - " + score;
	}
}
