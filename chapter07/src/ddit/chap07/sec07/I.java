package ddit.chap07.sec07;

class A { // ���� �̸��� �޼ҵ� 2�� 
	public void methodA(B b) { // bŬ���� Ÿ��
		b.methodB();
	}

	public void methodA(I i) { // �������̽� Ÿ��
		i.methodB();
	}
	// �� ���� �������� ������ ���๮�� a.methodA(new C());�� ������ �ȴ�
	// Ŭ���� B�� C�� ������ ���� ������ Ŭ�����ε� 
	// �̰��� �����ߴ� ���� �������̽��� ������ ������ ����
}

class B implements I {
	public void methodB() {
		System.out.println("BŬ������ methodB");
	}
}

class C implements I {
	public void methodB() {
		System.out.println("CŬ������ methodB");
	}
}

public interface I {
	void methodB();
}
