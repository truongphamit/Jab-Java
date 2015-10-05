import java.util.Scanner;

public class Ex3 {
	private static Item items[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");
		input(sc);
		System.out.println("Danh sach hang:");
		printMenu();
		
		Invoice invoice = new Invoice();
		getInvoice(invoice, sc);
		System.out.println("Hoa don:");
		invoice.print();
		System.out.println("Total: " + invoice.getTotal());
	}
	
	public static void input(Scanner sc) {
		int n;
		System.out.println("Nhap so mat hang: ");
		n = sc.nextInt();
		sc.nextLine();
		items = new Item[n];
		System.out.println("Nhap thong tin " + n + " mat hang: ");
		for (int i = 0; i < n; i++) {
			String name;
			double price;
			System.out.println("Mat hang #" + (i+1));
			System.out.println("Ten: ");
			name = sc.nextLine();
			System.out.println("Gia: ");
			price = sc.nextDouble();
			sc.nextLine();
			items[i] = new Item(name, price);
		}
	}
	
	public static void printMenu() {
		for (int i = 0; i < items.length; i++) {
			System.out.println((i+1) + "      " + items[i].getName() + "      " + items[i].getPrice());
		}
	}
	
	public static void getInvoice(Invoice invoice, Scanner sc) {
		int n;
		System.out.println("Nhap so mat hang muon mua: ");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap don hang");
		for (int i = 0; i < n; i++) {
			String name;
			int quantity;
			System.out.println("Mat hang #" + (i+1) + ": ");
			name = sc.nextLine();
			System.out.println("So luong: ");
			quantity = sc.nextInt();
			sc.nextLine();
			Item item = searchItem(name);
			if (item != null) {
				invoice.addInvoiceLineItem(new InvoiceLineItem(item, quantity));
			} else {
				System.out.println("Mat hang khong ton tai!");
			}
		}
	}
	
	public static Item searchItem(String name) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].getName().equals(name)) {
				return items[i];
			}
		}
		return null;
	}
}
