package ddit.chap07.sec05;

public class PhoneEx {

	public static void main(String[] args) {
		// SmartPhone smartphone = new SmartPhone("010-1234-5678", "Iphone-14");
		// �߻� Ŭ������ SmartPhone�� new �����ڸ� �� �� ���� �̿ϼ� ���¶�

		SmartPhone smartphone = new Iphone("010-1234-5678", "Iphone-14");
		// �ڵ�Ÿ�Ժ�ȯ : �θ�Ÿ���� ���������� �ڽ� ��ü�� �ּҸ� �ִ� ����

		smartphone.call();
		smartphone.turnOn();
		smartphone.game();

		Phone phone = new Iphone("010-9876-5432", "Iphone-14");
		// Iphone���� Phone�� �Ҿƹ��� �����

		phone.call();
		phone.turnOn();
		// Iphone���� turnOn�޼ҵ带 �����Ǹ� ���� - Iphone�� turnOn�޼ҵ带 ����
		// phone.game(); 
		// ���� : �θ�Ŭ�����κ��� �ڽ��� �������� ���� �ƴ� �ڽ�Ŭ�������� ���ǵ� ���̱� ������
		// => �θ�Ŭ�������� ���ǵ� �͸� �����ϴ� �� : ��ĳ����
	}

}
