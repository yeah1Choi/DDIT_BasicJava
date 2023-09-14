package ddit.chap07.sec06;

public class SmartPhone extends Computer implements Phone, Repair {
	// SmartPhone�� Computer�� ��ӹް� Phone�� Repair�� �����Ѵ�
	// SmartPhone�� 3���� �θ� �ް����� - Computer Phone Repair
	
	boolean power;

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_2);

		System.out.println("��ø�Ű�� " + number1 + number1 + number2 + "�Դϴ�");
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
