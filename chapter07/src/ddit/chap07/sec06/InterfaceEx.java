package ddit.chap07.sec06;

public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		smartphone.call(); // ��ø�Ű�� 112�Դϴ�

		Phone phone = new SmartPhone();
		phone.call();// ��ø�Ű�� 112�Դϴ� = ������, �������̽��� ������ ����

	}

}
