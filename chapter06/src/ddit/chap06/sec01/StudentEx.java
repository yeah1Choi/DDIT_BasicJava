package ddit.chap06.sec01;

// 문제 (1) 다음을 만족하는 Student 클래스를 작성하시오.
// · String형의 학과와 정수형의 학번을 필드로 선언
// · Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력

public class StudentEx {

	public static void main(String[] args) {
		Student std = new Student();
		// std라는 변수가 main메소드에 공간이 만들어지고 값이 주어지기전 기본값으로 null값을 가짐
		// new 연산자를 통해 heap 메모리에 Student 클래스의 멤버필드들 major와 studID가 저장됨
		// Student() 생성자를 통해 클래스가 호출이 됨

		// System.out.println(std.major); // result : null
		// System.out.println(std.studID); // result : 0

		// std.major = "경영학과";
		// std.studID = 20230115;

		// System.out.println(std.major); // result : 경영학과
		// System.out.println(std.studID); // result : 20230115
		// 데이터에 접근하려면 먼저 객체가 생성되어야 가능하다

		std.setMajor("경영학과");
		std.setStudID(202301015);
		System.out.println("학과 : " + std.getMajor());
		System.out.println("학번 : " + std.getStudID());
	}

}
