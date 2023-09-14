package ddit.chap07.sec06;

public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		smartphone.call(); // 간첩신고는 112입니다

		Phone phone = new SmartPhone();
		phone.call();// 간첩신고는 112입니다 = 다형성, 인터페이스도 다형성 지원

	}

}
