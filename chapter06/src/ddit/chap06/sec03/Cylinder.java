package ddit.chap06.sec03;

/*
 * 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
· 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
· 메소드 getVolume()은 원통의 부피를 반환
· Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
· Circle은 반지름, 원주율(상수:3.1415926), 원의 면적을 반환하는 메서드 (getArea())
 */

public class Cylinder {
	Circle c; // 상속관계는 아니지만 포함관계를 구현해 식을 계산하기 위함
	double height;

	Cylinder(Circle c, double height) {
		this.c = c;
		this.height = height;
	}

	public void getVolumn() { // 반환타입이 없어 void 사용
		System.out.println("원기둥의 부피: " + (c.getArea() * height));
	}
}
