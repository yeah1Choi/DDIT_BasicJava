package ddit.chap07.sec02;

public class Vehicle {

	public void run() {
		System.out.println("차량이 운행 중입니다");
	}
}

class Bus extends Vehicle {
	
	@Override
	public void run() {
		System.out.println("버스가 운행 중입니다");
	}
}

class Taxi extends Vehicle {
	
	@Override
	public void run() {
		System.out.println("택시가 운행 중입니다");
	}
}