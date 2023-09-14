package ddit.chap06.sec02;

public class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// this, super 참조형 변수 : 주소값을 저장 (자기가 포함된 자신의 클래스의)
	// 보통 생성자 메소드에서 사용 => 지역변수(매개변수로 전달되어 지는)와 멤버필드가 이름이 동일할 때 멤버변수를 지침하기 위해

//	public int getX() {
//		return x;
//	}
//	public void setX(int x) {
//		this.x = x;
//	}
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}

	// @Override 컴파일되는 주석 - 제정의한다 : toString을 제정의한다
	@Override
	public String toString() { // toString() : 객체 내용을 문자열로 반환할 때 사용하는 메소드
		return "("+x+", "+y+")";
		//return getClass().getName() + '@' + Integer.toHexString(hashCode());
		//return getClass().getName() + '@' + hashCode();
	}
}
