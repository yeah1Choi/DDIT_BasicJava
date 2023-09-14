package ddit.chap07.sec07;

class A { // 같은 이름의 메소드 2개 
	public void methodA(B b) { // b클래스 타입
		b.methodB();
	}

	public void methodA(I i) { // 인터페이스 타입
		i.methodB();
	}
	// 이 식을 실행하지 않으면 실행문의 a.methodA(new C());가 오류가 된다
	// 클래스 B와 C는 연관이 없는 각각의 클래스인데 
	// 이것을 연결했던 것이 인터페이스라서 없으면 연결이 끊김
}

class B implements I {
	public void methodB() {
		System.out.println("B클래스의 methodB");
	}
}

class C implements I {
	public void methodB() {
		System.out.println("C클래스의 methodB");
	}
}

public interface I {
	void methodB();
}
