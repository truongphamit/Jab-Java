import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}

	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public double getTotalExpense() {
		if (customer.isMember()) {
			return (serviceExpense
					- serviceExpense * new DiscountRate().getServiceDiscountRate(customer.getMemberType()))
					+ (productExpense
							- productExpense * new DiscountRate().getproductDiscountRate(customer.getMemberType()));
		} else {
			return serviceExpense + productExpense;
		}
	}

	@Override
	public String toString() {
		if (customer.isMember()) {
			return customer.getName() + ", is " + customer.getMemberType() + ", " + date + ", Product = "
					+ productExpense + ", Service = " + serviceExpense;
		} else {
			return customer.getName() + ", " + date + ", Product = "
					+ productExpense + ", Service = " + serviceExpense;
		}
	}
}
