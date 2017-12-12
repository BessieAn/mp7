
public class Flower {
	
	
	private double price;
	private int amount;
	private int stock;
	
	public Flower (int newStock, double newPrice) {
		this.stock = newStock;
		this.price = newPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock() {
		this.stock = this.stock - this.amount;
	}

	public double getPrice() {
		return price;
	}
	
	
	
}
