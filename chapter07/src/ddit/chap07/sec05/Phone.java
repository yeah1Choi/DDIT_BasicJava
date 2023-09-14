package ddit.chap07.sec05;
// 맨 위의 부모클래스
public abstract class Phone {
	String phoneNumber;
	
	Phone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("통화한다");
	}
	
	public abstract void turnOn(); 
	// 모든 하위 클래스들이 같은 기능을 갖고 있어야 부모 클래스를 갖고 상속관계를 성립가능
	// 추상메소드 : 수행 방법이 다름 - 중괄호를 안쓰는 이유 - 구현부가 없는 것 - 미완성메소드 - 스스로 객체생성안됨
	// 목적 : 최소한의 기본 메소드(from 부모클래스), 가이드라인을 갖고 클래스를 만들기 위해
}
