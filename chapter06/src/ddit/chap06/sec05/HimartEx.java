package ddit.chap06.sec05;

public class HimartEx {

	public static void main(String[] args) {
		Customer c1 = new Customer();

		c1.buy(new Audio());
		c1.buy(new Computer());
		c1.buy(new Audio());
		c1.buy(new Tv());

		c1.summary();

	}

}