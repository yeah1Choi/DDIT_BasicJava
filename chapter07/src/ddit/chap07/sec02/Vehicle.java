package ddit.chap07.sec02;

public class Vehicle {

	public void run() {
		System.out.println("������ ���� ���Դϴ�");
	}
}

class Bus extends Vehicle {
	
	@Override
	public void run() {
		System.out.println("������ ���� ���Դϴ�");
	}
}

class Taxi extends Vehicle {
	
	@Override
	public void run() {
		System.out.println("�ýð� ���� ���Դϴ�");
	}
}