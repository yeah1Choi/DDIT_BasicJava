package ddit.chap07.sec06;

public interface Phone {
	int PHONE_NUM_1=1; // ����� �빮�� ����� ����� ǥ��
	public static final int PHONE_NUM_2 = 2; // ������ �̷��� ���� => 'public static final' ����
	int PHONE_NUM_3=3;
	int PHONE_NUM_4=4;
	int PHONE_NUM_5=5;
	int PHONE_NUM_6=6;
	int PHONE_NUM_7=7;
	int PHONE_NUM_8=8;
	int PHONE_NUM_9=9;
	int PHONE_NUM_0=0;
	
	public void call(); 
	void turnOn();
	abstract void turnOff(); // ���� �� ���� ���� ������ ���� abstract ����
}
