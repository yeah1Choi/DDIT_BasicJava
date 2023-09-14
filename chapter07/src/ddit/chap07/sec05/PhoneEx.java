package ddit.chap07.sec05;

public class PhoneEx {

	public static void main(String[] args) {
		// SmartPhone smartphone = new SmartPhone("010-1234-5678", "Iphone-14");
		// 추상 클래스인 SmartPhone는 new 연산자를 쓸 수 없음 미완성 상태라

		SmartPhone smartphone = new Iphone("010-1234-5678", "Iphone-14");
		// 자동타입변환 : 부모타입의 참조변수에 자식 객체의 주소를 넣는 행위

		smartphone.call();
		smartphone.turnOn();
		smartphone.game();

		Phone phone = new Iphone("010-9876-5432", "Iphone-14");
		// Iphone에게 Phone은 할아버지 조상격

		phone.call();
		phone.turnOn();
		// Iphone에서 turnOn메소드를 재정의를 했음 - Iphone의 turnOn메소드를 실행
		// phone.game(); 
		// 오류 : 부모클래스로부터 자식이 재정의한 것이 아닌 자식클래스에만 정의된 것이기 때문에
		// => 부모클래스에서 정의된 것만 실행하는 것 : 업캐스팅
	}

}
