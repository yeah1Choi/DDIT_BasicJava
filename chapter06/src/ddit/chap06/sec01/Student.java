package ddit.chap06.sec01;

/*
 * 문제 7 – 위 1번에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.
· 필드를 모두 private로 하고, getter와 setter를 구현하고
· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당 한 값을 입력 후 출력
 */

public class Student {
	private String major;
	private int studID;

	Student(){} 
	
	Student(String major,int studID){
		this.major = major;
		this.studID = studID;
	} 
	
// getter : 변수 안의 값을 밖으로 내보냄(반환), 반환타입(멤버변수타입과 같음)이 있음 매개변수는 없음
	
	public String getMajor() {
		return major;
	}
	
	public int getStudID() {
		return studID;
	}
	

// setter : 반환타입이 없음 매개변수는 있음
	
	public void setMajor(String major) {
		this.major = major;
	} // 갱신의 목적
	
	public void setStudID(int studID) {
		this.studID = studID;
	}
}
