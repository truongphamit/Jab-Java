import java.util.ArrayList;

public class Library {
	private String address;
	private ArrayList<Book> books;

	public Library(String address) {
		this.address = address;
		books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void borrowBook(String name) {
		for (Book book : books) {
			if (book.getTitle() == name) {
				if (book.isBorrowed()) {
					System.out.println(address + " : Sach da duoc muon");
				} else {
					book.borrowed();
					System.out.println(address + " : muon thanh cong!");
				}
				return;
			}
		}
		System.out.println(address + " : Khong tim thay sach");
	}

	public void printAvailableBooks() {
		for (Book book : books) {
			if (book.isBorrowed() == false) {
				System.out.println(book);
			}
		}
	}

	public void returnBook(String name) {
		for (Book book : books) {
			if (book.getTitle() == name) {
				if (book.isBorrowed()) {
					book.returned();
					System.out.println(address + " : Tra thanh cong!");
				} else {
					System.out.println(address + " : tra thanh cong!");
				}
				return;
			}
		}
		System.out.println(address + " : Khong tim thay sach");
	}

	public static void main(String[]args){
		//Tạo hai thư viện có địa chỉ cụ thể được cho trước
		Library firstLibrary = new Library("10MainSt.");
		Library secondLibrary = new Library("228Liberty St.");

		//Thêm 4 cuốn sách vào thư viện thứ nhất
		firstLibrary.addBook(new Book("Family and Friend"));
		firstLibrary.addBook(new Book("Math"));
		firstLibrary.addBook(new Book("Formal Method"));
		firstLibrary.addBook(new Book("Logic"));

		//In địa chỉ thư viện
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		//Mượn sách Family and Friend
		System.out.println("Borrowing the Family and Friend:");
		firstLibrary.borrowBook("Family and Friend");
		firstLibrary.borrowBook("Family and Friend");
		secondLibrary.borrowBook("Family and Friend");
		System.out.println();

		//In danh mục sách hiện có
		System.out.println("Danh muc sach hien co trong thu vien thu nhat:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Danh muc sach hien co trong thu vien thu hai:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		//Trả sách Family and Friend
		System.out.println("Tra sach Family and Friend:");
		firstLibrary.returnBook("Family and Friend");
		System.out.println();

		//In danh mục sách hiện có trong thư viện thứ nhất
		System.out.println("Danh muc sach hien co trong thu vien thu nhat:");
		firstLibrary.printAvailableBooks();
	} 
}