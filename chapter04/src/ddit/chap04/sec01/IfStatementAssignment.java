package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementAssignment {

	public static void main(String[] args) {
		// ��ǻ�Ϳ� ����ڰ� ����,����, �� ������ �Ϸ��� �Ѵ�. �̸� ���α׷��� �Ͻÿ�.
		// ���� : 1, ���� :2, �� :3
		rockPaperScissors();

	}
	public static void rockPaperScissors() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ 1, ������ 2, ���� 3�Դϴ�." + "\n" +  "1���� 3 ������ ���ڸ� �Է��ϼ��� : ");
		
		int player = sc.nextInt(); 
		
		if (player >= 1 && player <= 3) {
			
			int com = (int)(Math.random() * 3) + 1;
			
			if(com == player) {
				System.out.println("�����ϴ�");
			} else {
				
				switch(com) {
				
				case 1 : 
					if (player == 2) {
						System.out.println("����� �̰���ϴ�");
					} else {
						System.out.println("����� �����ϴ�");
					}
					break;
				case 2 : 
					if (player == 3) {
						System.out.println("����� �̰���ϴ�");
					} else {
						System.out.println("����� �����ϴ�");
					}
					break;
				case 3 : 
					if (player == 1) {
						System.out.println("����� �̰���ϴ�");
					} else {
						System.out.println("����� �����ϴ�");
					}
					break;
				}
				
			}
			System.out.println();
			System.out.println("��ǻ�ʹ� " + com + "�� �½��ϴ� ^^*");

		} else {
			
			System.out.println("�������� ��� �����Դϴ�");
			
		}
	}
}
