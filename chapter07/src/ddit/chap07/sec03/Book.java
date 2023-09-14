package ddit.chap07.sec03;

public class Book {
	String isbn; // 책의 고유 도서번호 : 키 값을 부여하기 위해
	String title; // 제목
	int price; // 가격

	Book() {
	} // 기본생성자

	Book(String isbn, String title, int price) {
		this.isbn = isbn; 
		// 밖의 값을 매개변수로 받은 값을 멤버필드에 저장하기 위해 this 메소드로 호출
		this.title = title;
		this.price = price;
	}

	public void setSalePrice(double discountRate) { 
		// 할인가격을 설정하는 메소드
		price = price - (int) (price * discountRate);
		// 가격에는 실수값이 없어서 int로 타입변환
	}

	public void printInfo() {
		// 출력메소드
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
	}
}
