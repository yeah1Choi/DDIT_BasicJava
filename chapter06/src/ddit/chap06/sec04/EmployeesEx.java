package ddit.chap06.sec04;

import java.util.Scanner;

public class EmployeesEx {
	Scanner sc = new Scanner(System.in);
	Employees[] employee = { new Employees("202310001", "������", "����������"), new Employees("202110012", "��ο�", "����������"),
			new Employees("202011031", "�̼���", "����������"), new Employees("202210001", "���ڹ�", "����������"),
			new Employees("202010001", "���ڹ�", "����������") };

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
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);

			default:
				System.out.println("�۾���ȣ�� �߸� �����߽��ϴ�...");
			}
			choice = emp.view();
		}

	}

	public int view() {
		System.out.println("[[�����ȸ]]");
		System.out.println(" 1. ��ü��ȸ");
		System.out.println(" 2. �μ��� ��ȸ");
		System.out.println(" 9. ����");
		System.out.println("----------------");
		System.out.print("����>> ");
		int choice = sc.nextInt();
		return choice;
	}

	public void selectList() {
		System.out.println("�μ���             �����ȣ            �̸�");
		System.out.println("----------------------------");
		for (int i = 0; i < employee.length; i++) {
			System.out.printf("%-11s", employee[i].getDeptName());
			System.out.printf("%-11s", employee[i].getEmpID());
			System.out.printf("%-5s\n", employee[i].getEmpName());
		}
	}

	public void selectOne() {
		System.out.println("��ȸ�� �μ���: ");
		String dept = sc.next();
		System.out.println("�μ���             �����ȣ            �̸�");
		System.out.println("----------------------------");
		for (int i = 0; i < employee.length; i++) {
			if (dept.equals(employee[i].getDeptName())) {
				System.out.printf("%11s", employee[i].getDeptName());
				System.out.printf("%11s", employee[i].getEmpID());
				System.out.printf("%5s", employee[i].getEmpName());
			} else {
				System.out.println("��ȸ������ �����ϴ�.");
			}

		}

	}

}
