package oopHomework1;

public class OrderCreator {
	public static void main (String [] args) {
		Order salesOrder  = new SalesOrder("1", "Peter's Petshop");
		Order soldBlueWidget = new BlueWidget(salesOrder);
		Order soldGreenWidget = new GreenWidget(soldBlueWidget);
		
		System.out.println("Order " + soldGreenWidget.getOrderNumber() + ": " + soldGreenWidget.getOrderDescription() + "for " + salesOrder.getCompany());
		System.out.println("Order " + soldGreenWidget.getOrderNumber() + " price = " + soldGreenWidget.getTotalPrice());
		System.out.println();
		
		Order purchaseOrder = new PurchasingOrder("2", "ComEd");
		Order purchasedBlueWidget = new BlueWidget(purchaseOrder);
		Order purchasedGreenWidget = new GreenWidget(purchasedBlueWidget);
		
		System.out.println("Order " + purchasedGreenWidget.getOrderNumber() + ": " + purchasedGreenWidget.getOrderDescription() + "from " + purchaseOrder.getCompany());
		System.out.println("Order " + purchasedGreenWidget.getOrderNumber() + " price = " + purchasedGreenWidget.getTotalPrice());
	}
}
