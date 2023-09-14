package ddit.chap07.sec01;
// 부모
public class Shape {

	String kind; // 도형이름의 속성

	Shape(){} // 기본생성자, 초기화의 목적
	Shape(String kind) {
		this.kind = kind;
	}
	
	public double calcurateArea() { // 넓이를 구해 실수형으로 반환하는 메서드 만들기
		return 0.0;
	}
}
