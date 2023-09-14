package ddit.chap07.sec03;

public class Novel extends Book {
	String genre; // novel이 가진 속성

	// 자식클래스에 기본생성자가 있으려면 부모에서 같은 형식의 기본 생성자가 있어야한다
	Novel() {
	}

	Novel(String isbn, String title, int price, String genre) {
		super(isbn, title, price); // 부모생성자메소드 호출문
		this.genre = genre;
	}

	// 부모클래스에서 제정한 메소드 중
	// '실행' 메소드를 가져와 재정의한다
	@Override
	public void printInfo() {
		System.out.println("장르 : " + genre);
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price + "원");
	}

	public void refund() {
		System.out.println("소설책을 반품합니다");
	}

}
