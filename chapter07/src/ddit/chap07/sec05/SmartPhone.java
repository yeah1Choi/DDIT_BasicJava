package ddit.chap07.sec05;
// �Ʒ� �θ� Ŭ����
public abstract class SmartPhone extends Phone {
	String model;

	SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	public void game() {
		System.out.println("���ӱ���� �����Ǿ���");
	}

//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//
//	}
	// �߻� Ŭ������ ��ӹ޴� �ڽ� Ŭ�������� �θ�κ��� �߻�޼ҵ带 ��� �޾� �������̵��� �ؾ��Ѵ�
	// �׷��� ������ �ڽ� Ŭ������ �������̵� ��� ������ �߻� Ŭ������ �ٲٸ� �ȴ�
	// => �ڽ� Ŭ���� ���𹮿� ���������ڿ� class ���̿� abstract�� ����Ѵ�
}
// �ڽ�Ŭ����
class Iphone extends SmartPhone {
	Iphone(String phoneNumber, String model) {
		super(phoneNumber, model);
	}

	@Override
	public void turnOn() {
		System.out.println("������ư�� ���");

	}
}
// �� �޸𸮿� Iphone�� ����, ����� �޾Ҵ� �θ� Ŭ������ �� ���� �ڸ��ϰ� �ȴ� 
// ���� ���� �ڸ��Ϸ��� ������ �޼ҵ带 �ݵ�� ���� �־���Ѵ�
