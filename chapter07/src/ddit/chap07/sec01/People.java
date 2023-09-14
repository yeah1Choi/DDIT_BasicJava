package ddit.chap07.sec01;
// 부모클래스
public class People {
	String name;
	int age;
	String gender;

	People(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// 사용자가 매개변수를 세개를 갖는 생성자 메소드를 만들었기에 기본 생성자가 만들어 질 수 없다
	// 만약 사용자가 이렇게 안 만들었으면 컴파일러가 자동으로 기본 생성자 메소드를 만들었을것이다
}
