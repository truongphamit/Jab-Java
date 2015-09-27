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

	@Override
	public String toString() {
		return title;
	}
}