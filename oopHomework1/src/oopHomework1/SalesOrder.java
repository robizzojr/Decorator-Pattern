package oopHomework1;

public class SalesOrder extends Order{
	public SalesOrder(String orderNumber, String company) {
		this.orderNumber = orderNumber;
		this.company = company;
	}
	
	public String getOrderDescription() {
		return "Sales Order: ";
	}
}
