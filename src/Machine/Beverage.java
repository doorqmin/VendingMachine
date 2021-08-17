package Machine;

public class Beverage {
	private String name = "";
	private int price = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Beverage(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}