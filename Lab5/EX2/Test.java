import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer("Truong");
		customer.setMemberType("Gold");
		Visit visit = new Visit(customer, new Date(2015, 10, 10));
		visit.setServiceExpense(100);
		visit.setProductExpense(100);
		System.out.println(visit);
		System.out.println("Total: " + visit.getTotalExpense());
	}

}
