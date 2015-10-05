import java.util.Arrays;

public class Invoice {
	private InvoiceLineItem invoiceLineItems[];
	private int count;

	public Invoice() {
		invoiceLineItems = new InvoiceLineItem[8];
		count = 0;
	}

	public void addInvoiceLineItem(InvoiceLineItem invoiceLineItem) {
		if (count < this.invoiceLineItems.length) {
			this.invoiceLineItems[count] = invoiceLineItem;
			++count;
		} else {
			resize();
			this.invoiceLineItems[count] = invoiceLineItem;
			++count;
		}
	}

	public void resize() {
		invoiceLineItems = Arrays.copyOf(invoiceLineItems, invoiceLineItems.length * 2);
	}

	public double getTotal() {
		double sum = 0;
		for (InvoiceLineItem n : invoiceLineItems) {
			if (n != null) {
				sum += n.getSubtotal();
			}
		}
		return sum;
	}
	
	public void print() {
		for (int i = 0; i < invoiceLineItems.length; i++) {
			if (invoiceLineItems[i] != null) {
				System.out.println(invoiceLineItems[i]);
			}
		}
	}
}
