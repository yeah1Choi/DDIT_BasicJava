package ddit.chap07.sec05;
// �� ���� �θ�Ŭ����
public abstract class Phone {
	String phoneNumber;
	
	Phone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("��ȭ�Ѵ�");
	}
	
	public abstract void turnOn(); 
	// ��� ���� Ŭ�������� ���� ����� ���� �־�� �θ� Ŭ������ ���� ��Ӱ��踦 ��������
	// �߻�޼ҵ� : ���� ����� �ٸ� - �߰�ȣ�� �Ⱦ��� ���� - �����ΰ� ���� �� - �̿ϼ��޼ҵ� - ������ ��ü�����ȵ�
	// ���� : �ּ����� �⺻ �޼ҵ�(from �θ�Ŭ����), ���̵������ ���� Ŭ������ ����� ����
}
