package ddit.chap06.sec04;

// 사원클래스 :
// 사원번호 empID, 사원명 empName, 부서명 deptName, 급여 salary
// 5명의 사원정보를 생성, 저장
// 전체조회, 개별조회를 수행하는 메소드생성하시오

public class Employees {
	private String empID;
	private String empName;
	private String deptName;
	private int salary;

	// 기본생성자 : 매개 변수가 없는 생성자
	public Employees() {}

	// 사원번호, 사원명, 부서명만 입력받는 생성자(Salary는 0으로 설정)
	public Employees(String empID, String empName, String deptName) {
		this.empID = empID;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = 0;
	}

	// 급여를 설정하는 메소드
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 내용을 출력하는 메소드(toString())
	public String getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDeptName() {
		return deptName;
	}
}
