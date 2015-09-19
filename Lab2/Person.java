public class Person {
	private String fullName;

	public Person() {
		System.out.println("Contructor running!");
	}

	public Person(String fullName) {
		this.fullName = fullName;
		System.out.println("Parameter: " + fullName);
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void writeName() {
		System.out.println("My fullname is " + fullName);
	}
}

