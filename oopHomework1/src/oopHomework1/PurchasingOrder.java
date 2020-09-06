package oopHomework1;

public class PurchasingOrder extends Order{
	public PurchasingOrder(String orderNumber, String company) {
		this.orderNumber = orderNumber;
		this.company = company;
	}
	
	public String getOrderDescription() {
		return "Purchasing Order: ";
	}
}

