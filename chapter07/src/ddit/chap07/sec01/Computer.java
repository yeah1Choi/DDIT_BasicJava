package ddit.chap07.sec01;

public class Computer extends Product {

	double discountRate;

	Computer(String prodName, int price, double discountRate) {
		super(prodName, (int)(price-(price*discountRate)));
		this.discountRate = discountRate;
	}

}
