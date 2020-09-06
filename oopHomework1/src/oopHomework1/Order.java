package oopHomework1;

public abstract class Order {
	protected double totalPrice;
	
	protected String orderDescription;
	
	protected String orderNumber;
	
	protected String company;
	
	public double getTotalPrice() {
		return this.totalPrice;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		
	}
	
	public String getOrderDescription() {
		return this.orderDescription;
	}
	
	public String getOrderNumber() {
		return this.orderNumber;
	}
	
	public String getCompany() {
		return this.company;
	}
}
