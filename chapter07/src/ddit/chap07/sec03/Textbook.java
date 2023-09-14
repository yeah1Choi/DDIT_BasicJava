package ddit.chap07.sec03;

public class Textbook extends Book {
	String major; // 전공

	Textbook() {}

	Textbook(String isbn, String title, int price, String major) {
		super(isbn, title, price);
		this.major = major;
	}

	@Override
	public void printInfo() {
		System.out.println("전공분야 : " + major);
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
	}

	public void supplyBook(String buyer) {
		System.out.println(buyer + "에게 " + title + "책을 납품한다");
	}
}
