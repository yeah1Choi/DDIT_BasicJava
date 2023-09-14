package ddit.chap07.sec01;

// 자식 클래스 
public class Student extends People {
	// default 접근 지정자는 기본값으로 갖는 것이다
	int grade;
	String name; // 부모클래스에서 가져온 것이 아닌 자식인 Student에서 새로 먼저 호출이 되어서 결과값이 null로 나온다

	Student(String name, int age, String gender, int grade) {
		// 사용자가 호출한 생성자 메소드가 매개변수를 3개 가졌음으로 같이 맞게 만든다
		super(name, age, gender); // 부모에서 가져온 부모생성자메소드
		this.grade = grade;
	}

	public void printInfo() {
		System.out.println("학년 : " + grade);
		System.out.println("이름 : " + super.name); // 자식클래스에서 먼저 호출되었어도 부모클래스에서 참조할 수 있게 한다
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}
}
