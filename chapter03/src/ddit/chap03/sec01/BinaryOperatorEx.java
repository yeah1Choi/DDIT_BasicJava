package ddit.chap03.sec01;

import java.util.Scanner;

public class BinaryOperatorEx {

	public static void main(String[] args) {
		 //arithmeticOperator();
		 //relationalOperator();
		 //relationalOperator02();
		 //relationalOperator02Anwser();
		logicalOperator();
	}
	public static void arithmeticOperator() {
		// +, -, *, /, %
		
		// 1 ~ 100 ������ ¦�� �հ� Ȧ�� ���� ���
		int even = 0; // ¦�� ��
		int odd = 0;  // Ȧ�� ��
		for (int i = 1 ; i < 101 ; i++) {
			if(i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
			System.out.println("¦���� �� : " + even);
			System.out.println("Ȧ���� �� : " + odd);
		}
		
	}
	public static void relationalOperator() {
		// ��(����)���� : ũ�� ���Ҷ� ��� (>,<,=,>=,<=,!=(<>))
		// ����� true or false, �ַ� ���ǹ��� ���
		// Ű����� �Է��� ���� ������ 
		// 90 - 100 : A���� , 80 - 89 : B����, 
		// 70 - 79 : C����, 60 - 69 : D����, �� ���� : F����
		
		String grade = ""; // ����, ȭ��Ʈ �����̽��� �ʱⰪ���� �ο�
		
		Scanner sc = new Scanner(System.in); // ���־� ���� �ܿ��
		System.out.print("���� : ");
		int score = sc.nextInt(); 
		// ����(����)�� �ԷµǱ� ���� ���� ����(������)�� ���� �� ������ �־���
		
		if (score >= 90) {
			grade = "A����";
		} else if (score <= 89 && score >= 80) { // ª�� �� �� �ִ� ���ǹ��� ���� ��� �Ἥ �������ɼ��� ��������
			grade = "B����";
		} else if (score >= 70) {
			grade = "C����";
		} else if (score >= 60) {
			grade = "D����";
		} else {
			grade = "F����";
		}
		
		System.out.println(score + "������ " + grade + "�Դϴ�");
	}
	public static void relationalOperator02() {
		// Ű����� 10�� �̻��� ���̸� �Է¹޾� �� ����� ��� �κп� ���ϴ��� ���
		// ��) 35�� : "30���Դϴ�"
		
		String groups = "";
				
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̸� �Է��ϼ��� : ");
		
		int ages = sc.nextInt();
		
		if (ages >= 100) {
			System.out.println("����ϼ���! ���������ϼ���!");
		} else if (ages >= 90) {
			groups = "90��";
		} else if (ages >= 80) {
			groups = "80��";
		} else if (ages >= 70) {
			groups = "70��";
		} else if (ages >= 60) {
			groups = "60��";
		} else if (ages >= 50) {
			groups = "50��";
		} else if (ages >= 40) {
			groups = "40��";
		} else if (ages >= 30) {
			groups = "30��";
		} else if (ages >= 20) {
			groups = "20��";
		} else if (ages >= 10) {
			groups = "10��";
		} else {
			System.out.println("����� �� ���α׷��� ����ϱ⿡ ������������ �����Դϴ�");
	}
		System.out.println("�Է��� ����� ���̴� " + ages + "�̰� ���ɴ�� " + groups + "�Դϴ�");
	}
	public static void relationalOperator02Anwser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̸� �Է��ϼ��� : ");
		int age = Integer.parseInt(sc.nextLine());
		int age1 = (age / 10) * 10;
		String message = age1 + "���Դϴ�";
		System.out.println(age + "����" + message);
	}
	public static void logicalOperator() {
		// �������� : !(NOT) > &&(and) > ||(or) * ���� �� not �����ڴ� ���� �����ڶ� ���� ����
		
		// �ڽ��� ����⵵�� �Է¹޾� ����� ����� �Ǵ��Ͻÿ�
		// ���� : (4�� ����̸鼭 100�� 10���� �ƴ� ���̰ų�)(400�� ����� �Ǵ� ��)
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ : ");
		int year = Integer.parseInt(sc.nextLine());
		
		if ((year % 4 == 0 && year % 100 != 0)) {
			
		} else {
			
		}
	}
}
