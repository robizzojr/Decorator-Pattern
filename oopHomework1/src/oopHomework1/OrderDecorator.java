package oopHomework1;

public abstract class OrderDecorator extends Order{
	public Order order;
	public abstract double getTotalPrice();
	public void setTotalPrice(float totalPrice) {}
	public abstract String getOrderDescription();
	public abstract String getOrderNumber();

}
