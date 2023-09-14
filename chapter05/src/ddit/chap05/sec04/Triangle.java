package ddit.chap05.sec04;

public class Triangle {
	Point[] p; // point 배열타입 클래스, 의미: p에 저장된 배열의 주소를 따라가면 point를 만난다 (point에 point 중복)
	// 배열을 p가 가질 수 있도록 함

	Triangle(Point[] p) {
		this.p = new Point[] { new Point(100, 100), new Point(500, 100), new Point(250, 250) };
	}
	// this.p = new Point[] 여기서 배열이 만들어 지고 ,
	// new Point(100, 100) => 괄호가 있으니 이것은 클래스 객체가 만들어지고, 100,100 정수 값이 초기화가 일어난다
	// 배열의 데이터가 들어갈 수 있는 곳은 3칸 이므로 초기화가 같은 곳에 3번이 이루어지는 것이 아니라 각 다른 칸에 하나씩 초기화되어 데이터
	// 값이 들어간다

	public void draw() {
		System.out.println(p[0] + "과 " + p[1] + " 연결합니다");
		System.out.println(p[1] + "과 " + p[2] + " 연결합니다");
		System.out.println(p[2] + "과 " + p[0] + " 연결합니다");
	}
}
