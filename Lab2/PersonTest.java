public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setFullName("Pham Van A");
		Person person2 = new Person("Nguyen Van B");
		
		person1.writeName();
		person2.writeName(); 
	}
}
