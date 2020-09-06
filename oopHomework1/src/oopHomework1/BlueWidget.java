package oopHomework1;

public class BlueWidget extends OrderDecorator{
	public BlueWidget(Order order) {
		this.order = order;
	}
	
	public double getTotalPrice() {
		return order.getTotalPrice() + 4.99;
	}

	public String getOrderDescription() {
		return order.getOrderDescription() + "Blue Widget, ";
	}
	public String getOrderNumber() {
		return order.getOrderNumber();
	}

}
