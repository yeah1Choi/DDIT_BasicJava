package ddit.chap06.sec04;

// �������̸�, ���¹�ȣ, �ܰ��� �Ӽ��� �ְ�
// �Ա�(deposit), ���(withdraw), �ܰ�Ȯ��(getBalance) �޼���

public class Account {
	private String owner;
	private String accountNo;
	private int balance;

	public Account() {
		this("ȫ�浿", "1234-12-1234", 1000);
	}

	public Account(String owner, String accountNo) {
		// this(owner, accountNo, balance);
		// int balance = 5000; ����
		this(owner, accountNo, 5000);
	}

	public Account(String owner, String accountNo, int balance) {
		this.owner = owner;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// void �ǵ��� �ִ� ���� ����
	public void deposit(int money) {
		balance = balance + money;
		System.out.println("[�Ա�]");
		getBalance();
	}

	public void withdraw(int money) {
		if (balance >= money) {
			balance = balance - money;
			System.out.println("[���]");
			getBalance();
		} else {
			System.out.println("�ܰ����");
		}
	}

	public void getBalance() {
		System.out.println("--------------------");
		System.out.println("���� : " + owner + "\n�ܰ� : " + balance);
		System.out.println("--------------------\n");
	}

}
