package ddit.chap06.sec04;

// ���Ŭ���� :
// �����ȣ empID, ����� empName, �μ��� deptName, �޿� salary
// 5���� ��������� ����, ����
// ��ü��ȸ, ������ȸ�� �����ϴ� �޼ҵ�����Ͻÿ�

public class Employees {
	private String empID;
	private String empName;
	private String deptName;
	private int salary;

	// �⺻������ : �Ű� ������ ���� ������
	public Employees() {}

	// �����ȣ, �����, �μ��� �Է¹޴� ������(Salary�� 0���� ����)
	public Employees(String empID, String empName, String deptName) {
		this.empID = empID;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = 0;
	}

	// �޿��� �����ϴ� �޼ҵ�
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// ������ ����ϴ� �޼ҵ�(toString())
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
