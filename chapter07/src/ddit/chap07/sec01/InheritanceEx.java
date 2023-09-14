package ddit.chap07.sec01;

public class InheritanceEx {

	public static void main(String[] args) {
		People gildong = new People("홍길동", 31, "남성"); // 상속될 수 없음

		Student s1 = new Student("정몽주", 27, "여성", 4);
		s1.printInfo();
	}
}
