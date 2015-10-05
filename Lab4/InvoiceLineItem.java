
public class InvoiceLineItem {
	private Item item;
	private int quantity;

	public InvoiceLineItem() {

	}

	public InvoiceLineItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double  getSubtotal() {
		return item.getPrice() * quantity;
	}

	@Override
	public String toString() {
		return item.getName() + "      " + quantity + "      " + getSubtotal();
	}
	
	
}
