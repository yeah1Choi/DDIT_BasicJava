package ddit.chap06.sec04;

public class AccountEx {

	public static void main(String[] args) {
		Account acc1 = new Account(); // 기본생성자
		acc1.getBalance();
		
		acc1.deposit(50000);
		acc1.withdraw(30000);
	}

}
