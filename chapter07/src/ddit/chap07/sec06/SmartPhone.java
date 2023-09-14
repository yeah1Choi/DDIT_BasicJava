package ddit.chap07.sec06;

public class SmartPhone extends Computer implements Phone, Repair {
	// SmartPhone는 Computer를 상속받고 Phone와 Repair을 구현한다
	// SmartPhone는 3개의 부모를 받고있음 - Computer Phone Repair
	
	boolean power;

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_2);

		System.out.println("간첩신고는 " + number1 + number1 + number2 + "입니다");
	}

	@Override
	public void turnOn() {
		if (!power)
			power = !power;
	}

	@Override
	public void turnOff() {
		if (power)
			power = !power;

	}

}
