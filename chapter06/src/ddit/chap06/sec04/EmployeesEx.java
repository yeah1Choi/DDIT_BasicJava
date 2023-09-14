package ddit.chap06.sec04;

import java.util.Scanner;

public class EmployeesEx {
	Scanner sc = new Scanner(System.in);
	Employees[] employee = { new Employees("202310001", "정몽주", "공공개발팀"), new Employees("202110012", "김민우", "개발지원팀"),
			new Employees("202011031", "이순신", "공공개발팀"), new Employees("202210001", "박자바", "공공개발팀"),
			new Employees("202010001", "강자바", "공공개발팀") };

	public static void main(String[] args) {
		EmployeesEx emp = new EmployeesEx();
		int choice = emp.view();
		while (true) {
			switch (choice) {
			case 1:
				emp.selectList();
				break;

			case 2:
				emp.selectOne();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다...");
				System.exit(0);

			default:
				System.out.println("작업번호를 잘못 선택했습니다...");
			}
			choice = emp.view();
		}

	}

	public int view() {
		System.out.println("[[사원조회]]");
		System.out.println(" 1. 전체조회");
		System.out.println(" 2. 부서별 조회");
		System.out.println(" 9. 종료");
		System.out.println("----------------");
		System.out.print("선택>> ");
		int choice = sc.nextInt();
		return choice;
	}

	public void selectList() {
		System.out.println("부서명             사원번호            이름");
		System.out.println("----------------------------");
		for (int i = 0; i < employee.length; i++) {
			System.out.printf("%-11s", employee[i].getDeptName());
			System.out.printf("%-11s", employee[i].getEmpID());
			System.out.printf("%-5s\n", employee[i].getEmpName());
		}
	}

	public void selectOne() {
		System.out.println("조회할 부서명: ");
		String dept = sc.next();
		System.out.println("부서명             사원번호            이름");
		System.out.println("----------------------------");
		for (int i = 0; i < employee.length; i++) {
			if (dept.equals(employee[i].getDeptName())) {
				System.out.printf("%11s", employee[i].getDeptName());
				System.out.printf("%11s", employee[i].getEmpID());
				System.out.printf("%5s", employee[i].getEmpName());
			} else {
				System.out.println("조회내역이 없습니다.");
			}

		}

	}

}
