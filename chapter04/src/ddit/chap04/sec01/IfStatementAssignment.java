package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementAssignment {

	public static void main(String[] args) {
		// 컴퓨터와 사용자가 가위,바위, 보 게임을 하려고 한다. 이를 프로그래밍 하시오.
		// 가위 : 1, 바위 :2, 보 :3
		rockPaperScissors();

	}
	public static void rockPaperScissors() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3입니다." + "\n" +  "1에서 3 사이의 숫자를 입력하세요 : ");
		
		int player = sc.nextInt(); 
		
		if (player >= 1 && player <= 3) {
			
			int com = (int)(Math.random() * 3) + 1;
			
			if(com == player) {
				System.out.println("비겼습니다");
			} else {
				
				switch(com) {
				
				case 1 : 
					if (player == 2) {
						System.out.println("당신은 이겼습니다");
					} else {
						System.out.println("당신은 졌습니다");
					}
					break;
				case 2 : 
					if (player == 3) {
						System.out.println("당신은 이겼습니다");
					} else {
						System.out.println("당신은 졌습니다");
					}
					break;
				case 3 : 
					if (player == 1) {
						System.out.println("당신은 이겼습니다");
					} else {
						System.out.println("당신은 졌습니다");
					}
					break;
				}
				
			}
			System.out.println();
			System.out.println("컴퓨터는 " + com + "을 냈습니다 ^^*");

		} else {
			
			System.out.println("범위에서 벗어난 숫자입니다");
			
		}
	}
}
