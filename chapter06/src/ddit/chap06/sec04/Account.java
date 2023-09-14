package ddit.chap06.sec04;

// 소유자이름, 계좌번호, 잔고의 속성이 있고
// 입금(deposit), 출금(withdraw), 잔고확인(getBalance) 메서드

public class Account {
	private String owner;
	private String accountNo;
	private int balance;

	public Account() {
		this("홍길동", "1234-12-1234", 1000);
	}

	public Account(String owner, String accountNo) {
		// this(owner, accountNo, balance);
		// int balance = 5000; 오류
		this(owner, accountNo, 5000);
	}

	public Account(String owner, String accountNo, int balance) {
		this.owner = owner;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// void 되돌려 주는 값이 없다
	public void deposit(int money) {
		balance = balance + money;
		System.out.println("[입금]");
		getBalance();
	}

	public void withdraw(int money) {
		if (balance >= money) {
			balance = balance - money;
			System.out.println("[출금]");
			getBalance();
		} else {
			System.out.println("잔고부족");
		}
	}

	public void getBalance() {
		System.out.println("--------------------");
		System.out.println("고객명 : " + owner + "\n잔고 : " + balance);
		System.out.println("--------------------\n");
	}

}
