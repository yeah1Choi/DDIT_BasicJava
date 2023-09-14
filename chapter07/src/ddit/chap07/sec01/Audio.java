package ddit.chap07.sec01;

public class Audio extends Product {

	double discountRate;

	Audio(String prodName, int price, double discountRate) {
		super(prodName, (int) (price - (price * discountRate)));
		this.discountRate = discountRate;
	}

}
