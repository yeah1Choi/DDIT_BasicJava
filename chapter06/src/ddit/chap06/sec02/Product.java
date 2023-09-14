package ddit.chap06.sec02;

public class Product { // 멤버필드
	static int pid; // 제품번호
	static String pName = "마커펜"; // 제품명

	Product() { // 생성자메소드 : 멤버필드(변수) 초기화
		pid++;
		pName = "마커펜";
	}

	public static void showProduct() {
		System.out.println("제품번호 : " + (pid++));
		System.out.println("제품명 : " + pName);
	}
}
