package ddit.chap07.sec01;
// �ڽ�
public class Tv extends Product {

	double discountRate;

	Tv(String prodName, int price, double discountRate) {
		//super(prodName, price); 
		super(prodName, (int)(price-(price*discountRate)));
		this.discountRate = discountRate;
	}
}
