package ddit.chap06.sec01;

// 문제 2 – main 메서드에서 실행시켰을 때 제조사, 생산년도, 크기를 출력하는 Tv클래스를 생성하시오.

public class Tv {
	// 직접 초기화
	String company = "SAMSUNG";
	int year = 2022;
	double size = 60.6;

	{ // 초기화 블록
		company = "LG";
		year = 2023;
		size = 75.5;
	}
	// 직접 초기화와 초기화 블록은 고정된 값을 가진 개체를 반복할때

	// 생성자메소드
	Tv(String company, int year, double size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
}
