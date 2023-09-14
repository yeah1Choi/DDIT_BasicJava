package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementEx {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//method01();
		//method02();
		//ifPractice01();
		//ifPractice02();
		ifPractice03();

	}
	public static void method01() {
		// ������ �ϳ� �Է� �޾� 60�� �̻��̸� '�հ�'�� ���
		int score = 70;
		if(score >= 60) System.out.println("�հ�");
	}
	public static void method02() {
		// ������ �ϳ� �Է� �޾� 60�� �̻��̸� '�հ�', �� ���ϸ� '���հ�' ���
		int score = 50;
		if(score >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}
	public static void ifPractice01() {
		// 1~12���� �ش��ϴ� �� �ϳ��� �Է¹޾� ���ǿ� �ش��ϴ� ���� �ο��ض�
		// 3~5�� : '��'
		// 6~8�� : '����'
		// 9~11�� : '����'
		// 12~2�� : '�ܿ�'
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ ���� �Է� : ");
		int month = sc.nextInt(); 
		
		/* if(month < 3) {
			System.out.println(month + "���� �ܿ��Դϴ�");
		} else if(month <= 5) {
			System.out.println(month + "���� ���Դϴ�");
		} else if(month <= 8) {
			System.out.println(month + "���� �����Դϴ�");
		} else if(month <= 11) {
			System.out.println(month + "���� �����Դϴ�");
		} else {
			System.out.println(month + "���� �ܿ��Դϴ�");
		} */
		if(month < 0 || month > 12) {
			System.out.println("�߸��� �� �Է��Դϴ�");
		} else {
			if(month >= 3 && month <= 5) {
				System.out.println(month + "���� ���Դϴ�");
			} else if(month >= 6 && month <= 8) {
				System.out.println(month + "���� �����Դϴ�");
			} else if(month >= 9 && month <= 11) {
				System.out.println(month + "���� �����Դϴ�");
			} else {
				System.out.println(month + "���� �ܿ��Դϴ�");
			}
		}
		
	}
	public static void ifPractice02() {
		// ������ �Է¹޾� �� ���� 
		// 100~97 : A+
		// 96~93  : A0
		// 92~90  : A-
		// 89~87  : B+
		// 86~83  : B0
		// 82~80  : B-
		// �� ���ϴ� F�̴�
		
		int score  = 94;
		String grade = "";
		if (score >= 90) {
			grade = "A";
			if (score > 96) {
				grade = grade + "+";
			} else if (score > 92) {
				grade = grade + "0";
			} else {
				grade = grade + "-";
			}
		} else if (score >= 80) {
			grade = "A";
			if (score > 86) {
				grade = grade + "+";
			} else if (score > 82) {
				grade = grade + "0";
			} else {
				grade = grade + "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "�� ������ " + grade + "�Դϴ�");
	}
	public static void ifPractice03() {
		// Ű(��ġ)�� ü��(ų�α׷�)�� �Է��Ͽ� BMI������ ���ϰ� ������ ���� ������ �Ͻÿ�
		// BMI = ü�� / (Ű * Ű)
		// 0    ~ 18.4  : ��ü��
		// 18.5 ~ 22.9  : ����
		// 23.0 ~ 24.9  : ��ü��
		// 25.0 ~ 29.9  : ��
		// 30.0 �̻�            : ����
		
		int height;
		int weight;
		
		System.out.print("����� Ű�� �Է� : ");
		height = sc.nextInt(); 
		
		// sc.nextLine(); 
		
		System.out.print("����� �����Ը� �Է� : ");
		weight = sc.nextInt(); 
		
		double bmi = (double)weight / ((((double)height/100) * ((double)height/100)));
		
		if (bmi > 0 && bmi < 18.5) {
			System.out.println("��ü��");
		} else if(bmi < 23.0) {
			System.out.println("����");
		} else if(bmi < 25.0) {
			System.out.println("��ü��");
		} else if(bmi < 30.0) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
	}
}

/*class Account {
	private static Account instance = null;
	private Account() {}
	public static Account getInstance() {
		if(instance == null) instance = new Account(); 
		// if ���� if�� �ϳ��� �������� ������ �ѹ������� �߰�ȣ ���� �� �� �ִ�
		return instance;
	}
}
*/