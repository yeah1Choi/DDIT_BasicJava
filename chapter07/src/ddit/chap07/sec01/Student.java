package ddit.chap07.sec01;

// �ڽ� Ŭ���� 
public class Student extends People {
	// default ���� �����ڴ� �⺻������ ���� ���̴�
	int grade;
	String name; // �θ�Ŭ�������� ������ ���� �ƴ� �ڽ��� Student���� ���� ���� ȣ���� �Ǿ ������� null�� ���´�

	Student(String name, int age, String gender, int grade) {
		// ����ڰ� ȣ���� ������ �޼ҵ尡 �Ű������� 3�� ���������� ���� �°� �����
		super(name, age, gender); // �θ𿡼� ������ �θ�����ڸ޼ҵ�
		this.grade = grade;
	}

	public void printInfo() {
		System.out.println("�г� : " + grade);
		System.out.println("�̸� : " + super.name); // �ڽ�Ŭ�������� ���� ȣ��Ǿ�� �θ�Ŭ�������� ������ �� �ְ� �Ѵ�
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
	}
}
