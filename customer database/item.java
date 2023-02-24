
public enum item {

	Laptops(15, 0), Mouse(17, 0), Keyboards(25, 0), Desktops(16, 0), Headphones(35, 0), Routers(19, 0);

	private final int price;
	private int quantity;

	item(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
