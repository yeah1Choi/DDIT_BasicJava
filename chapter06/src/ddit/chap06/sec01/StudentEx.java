package ddit.chap06.sec01;

// ���� (1) ������ �����ϴ� Student Ŭ������ �ۼ��Ͻÿ�.
// �� String���� �а��� �������� �й��� �ʵ�� ����
// �� Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է� �� ���

public class StudentEx {

	public static void main(String[] args) {
		Student std = new Student();
		// std��� ������ main�޼ҵ忡 ������ ��������� ���� �־������� �⺻������ null���� ����
		// new �����ڸ� ���� heap �޸𸮿� Student Ŭ������ ����ʵ�� major�� studID�� �����
		// Student() �����ڸ� ���� Ŭ������ ȣ���� ��

		// System.out.println(std.major); // result : null
		// System.out.println(std.studID); // result : 0

		// std.major = "�濵�а�";
		// std.studID = 20230115;

		// System.out.println(std.major); // result : �濵�а�
		// System.out.println(std.studID); // result : 20230115
		// �����Ϳ� �����Ϸ��� ���� ��ü�� �����Ǿ�� �����ϴ�

		std.setMajor("�濵�а�");
		std.setStudID(202301015);
		System.out.println("�а� : " + std.getMajor());
		System.out.println("�й� : " + std.getStudID());
	}

}
