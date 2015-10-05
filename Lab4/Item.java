
public class Item {
	private String id;
	private String name;
	private double price;
	private String infor;

	public Item() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInfor() {
		return infor;
	}

	public void setInfor(String infor) {
		this.infor = infor;
	}

	public Item(String id, String name, double price, String infor) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.infor = infor;
	}

}
