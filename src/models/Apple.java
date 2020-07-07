package models;

public class Apple extends Fruit {

	 private int price = 10;
	 private boolean discounted; 
	
	public static void main(String[] args) {
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getDiscounted() {
		return discounted;
	}

	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}

}
