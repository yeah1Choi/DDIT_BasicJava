package ddit.chap06.sec05;

public class Customer {
	private int money;
	private int bonusPoint;
	private String cart = "";

	Customer() {
	}

	public void buy(Goods goods) { // Goods goods : �θ�Ŭ���� �ڽ��� Ŭ���� �����Ǿ� ȣ��� : ������
		money = money + goods.price;
		bonusPoint += goods.bonusPoint;
		cart = cart + "," + goods;
	}

//	public void buy(Tv t) {
//		money = money + t.price;
//		bonusPoint += t.bonusPoint;
//		cart = cart + "," + t;
//	}
//
//	public void buy(Computer c) {
//		money = money + c.price;
//		bonusPoint += c.bonusPoint;
//		cart = cart + "," + c;
//	}
//
//	public void buy(Audio a) {
//		money = money + a.price;
//		bonusPoint += a.bonusPoint;
//		cart = cart + "," + a;
//	}

	public void summary() {
		System.out.print("����ǰ��: " + cart.substring(1));
		System.out.println("\n���Աݾ� �հ�: " + money);
		System.out.println("��������Ʈ :" + bonusPoint);
	}

}