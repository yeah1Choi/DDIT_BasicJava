package ddit.chap04.sec04;

import java.io.IOException;
import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		WhileStatement ws = new WhileStatement();
		// ������ : �Ұ�ȣ�� ���� ������ Ŭ������ �״�� �����Դ�
		// �ν��Ͻ� ������ �ʱ�ȭ ��Ű�� ����
		// ws.whileMethod01();
		//ws.whileMethod02();
		//ws.whileMethod03();
	}

}

class WhileStatement {
	// Ŭ������ ������ ������ �ȵ� - new �޼ҵ尡 ������ ��ü�� ������ �� ���� string ����
	public static void whileMethod01() {
		// 1~100 ������ Ȧ���� ¦�� ��

		int cnt = 1; // 1~100 ������ ���� �����ϴ� ����
		int even = 0; // ¦���� �� ����
		int odd = 0; // Ȧ���� �� ����

		while (cnt < 101) {
			if (cnt % 2 == 0) {
				even = even + cnt;
			} else {
				odd = odd + cnt;
			}
			cnt++; // �������� ���� ������ �ξ���
		}
		System.out.println("Ȧ���� �� =" + odd);
		System.out.println("¦���� �� =" + even);
	}

	public static void whileMethod02() {
		// Ű����� �����ϳ��� �Է¹޾� �� �ڸ����� ���� ���Ͻÿ�
		// ��) 23456 => 2+3+4+5+6 = 20

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");

		int num = sc.nextInt();
		int sum = 0;

		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("�� �ڸ����� �� : " + sum);
	}
	public static void whileMethod03() {
		// ��ǻ�Ͱ� 1~50 ������ ������ �ϳ� �߻���Ű�� ����ڰ� �� ���ڸ� ���ߴ� ����
		// ��ǻ�� ���� > ����� �Է� �� => "�� ū �� �Է��Ͻÿ�"
		// ��ǻ�� ���� < ����� �Է� �� => "�� ���� �� �Է��Ͻÿ�"
		// ��ǻ�� ���� = ����� �Է� �� => "�����Դϴ�"

		int ch = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int comNum = (int)(Math.random()*50)+1;
		
		try {
			do {
				
			} while ((char)(ch = System.in.read())!='y'); 
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

















