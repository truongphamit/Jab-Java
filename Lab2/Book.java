public class Book {
	private String title;
	private Boolean borrowed;

	public Book(String bookTitle){
		title = bookTitle;
		borrowed = false;
	}

	public void borrowed() {
		borrowed = true;
	}

	public void returned() {
		borrowed = false;
	}

	public Boolean isBorrowed() {
		return borrowed;	
	}

	public String getTitle() {
		return title;
	}

	public static void main(String[] arguments){
		Book book = new Book("Family and Friend");
		System.out.println("Title (should be Family and Friend):" + book.getTitle());
		System.out.println("Borrowed?(should be false): " + book.isBorrowed());
		book.borrowed();
		System.out.println("Borrowed?(should be true):" + book.isBorrowed());
		book.returned();
		System.out.println("Borrowed?(should be false): " + book.isBorrowed());
	}
}
