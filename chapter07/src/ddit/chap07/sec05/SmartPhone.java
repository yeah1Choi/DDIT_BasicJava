package ddit.chap07.sec05;
// 아래 부모 클래스
public abstract class SmartPhone extends Phone {
	String model;

	SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	public void game() {
		System.out.println("게임기능이 제공되었다");
	}

//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//
//	}
	// 추상 클래스를 상속받는 자식 클래스들은 부모로부터 추상메소드를 상속 받아 오버라이딩을 해야한다
	// 그러기 싫으면 자식 클래스는 오버라이딩 대신 스스로 추상 클래스로 바꾸면 된다
	// => 자식 클래스 선언문에 접근제한자와 class 사이에 abstract를 써야한다
}
// 자식클래스
class Iphone extends SmartPhone {
	Iphone(String phoneNumber, String model) {
		super(phoneNumber, model);
	}

	@Override
	public void turnOn() {
		System.out.println("우측버튼을 사용");

	}
}
// 힙 메모리에 Iphone이 저장, 상속을 받았던 부모 클래스도 그 옆에 자리하게 된다 
// 각각 값이 자리하려면 생성자 메소드를 반드시 갖고 있어야한다
