package tdd.bankbusiness;

/**
 *	TDD 실습하기
 *
 *	은행 계좌(Account) 클래스 
 *
 *	클래스 이름은 Account
 *  기능은 세가지 
 *  1) 잔고조회 
 *  2) 입금
 *  3) 출금
 *  금액은 원 단위로(예: 천 원 = 1000)
 */
public class Account {
	private int balance;

	public Account(int money) {
		this.balance = money;
	}

	public int getBalance()  {
		return this.balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}
}
