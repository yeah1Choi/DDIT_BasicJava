package ddit.chap11.list;

public class Employees {
	String eid;
	String name;
	int salary;

	Employees(String eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[" + eid + name + salary + "]";
	}
}
