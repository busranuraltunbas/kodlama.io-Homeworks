package gameManagement.Entites;

public class Sale {
	private int id;
	private int customerId;
	private double price;
	private String salesDate;
	public Sale(int id, int customerId, double price, String salesDate) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.price = price;
		this.salesDate = salesDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	
	

}
