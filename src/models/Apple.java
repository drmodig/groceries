package models;

public class Apple extends Fruit {

	 private double price = 10;
	 private boolean discounted; 
	
	public static void main(String[] args) {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getDiscounted() {
		return discounted;
	}

	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}

}
