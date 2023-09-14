package ddit.chap06.sec05;

public class Goods {
	private String itemName;
	int price;
	int bonusPoint;

	Goods() {
	}

	Goods(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
		this.bonusPoint = (int) (price * 0.001);
	}

	@Override
	public String toString() {
		return itemName;
	}
}
