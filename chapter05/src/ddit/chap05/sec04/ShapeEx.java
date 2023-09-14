package ddit.chap05.sec04;

public class ShapeEx {

	public static void main(String[] args) {
		Point[] p = new Point[3]; // 배열 point 3개짜리를 만들어서 point배열을 변수 p에 넣어
		Triangle t1 = new Triangle(p);
		// 변수 p를 Triangle 클래스에 객체를 만들어 t1 변수에 집어넣음
		t1.draw();
	}

}
