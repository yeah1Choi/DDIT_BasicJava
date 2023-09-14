package ddit.chap07.sec03;

public class BookEx {

	public static void main(String[] args) {
		Book b1 = new Book("4848-71", "난장이가 쏘아올린 공", 15000);
		// 부모 클래스 객체가 스스로 만들어진 경우 상속이 안됨 b1은 상속제외
		Novel n1 = new Novel("1111-22", "아낌없이 주는 나무", 5000, "동화");
		n1.printInfo();
		n1.setSalePrice(0.2);
		n1.printInfo();

		Textbook t1 = new Textbook("3535-12", "혼자공부하는자바", 18000, "Java");
		t1.printInfo();
		t1.setSalePrice(0.1);
		t1.printInfo();
		
		Book b2 = new Novel("1111-22", "아낌없이 주는 나무", 5000, "동화");
		Book b3 = new Textbook("3535-12", "혼자공부하는자바", 18000, "Java");
		// 자식 클래스에서 선언한 변수는 부모에서 사용할 수 없다 - genre,major...
		
		b2.printInfo(); // 결과에 부모의 title, price 뿐 아니라 자식의 genre까지 도출됨
		// 자식클래스에서 재정의한 메소드는 부모클래스에서 호출해도 재정의된 자식 클래스의 메소드를 호출
		//b3.major = "Computer-Language"; // 오류 - 자식클래스에서 넘겨준, 부모가 자체로 가진 변수만 접근 가능
		
		// Textbook 클래스의 supplyBook() 호출이 요구될때 - downcasting 해야함
		// => 그전에 인스턴스 객체 - instanceof 연산자 사용
		if(b3 instanceof Textbook) {
			Textbook tb1 = (Textbook)b2;
			tb1.supplyBook("한국대학교");
		}
	}

}
