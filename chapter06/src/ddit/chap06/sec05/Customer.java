package ddit.chap06.sec05;

public class Customer {
	private int money;
	private int bonusPoint;
	private String cart = "";

	Customer() {
	}

	public void buy(Goods goods) { // Goods goods : 부모클래스 자식의 클래스 생성되어 호출됨 : 다형성
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
		System.out.print("구입품목: " + cart.substring(1));
		System.out.println("\n구입금액 합계: " + money);
		System.out.println("적립포인트 :" + bonusPoint);
	}

}