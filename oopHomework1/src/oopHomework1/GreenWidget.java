package oopHomework1;

public class GreenWidget extends OrderDecorator{
	public GreenWidget(Order order) {
		this.order = order;
	}
	
	public double getTotalPrice() {
		return order.getTotalPrice() + 7.99;
	}

	public String getOrderDescription() {
		return order.getOrderDescription() + "Green Widget, ";
	}
	public String getOrderNumber() {
		return order.getOrderNumber();
	}

}
