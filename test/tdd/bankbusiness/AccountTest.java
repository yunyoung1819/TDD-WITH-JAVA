package tdd.bankbusiness;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import tdd.bankbusiness.Account;

/**
 * 계좌 클래스(Account)에 대한 테스트 케이스 작성을 위해 만든 테스트 클래스 
 *
 */
public class AccountTest {

	private Account account;
	
	@Before
	public void setup() {
		account = new Account(10000);
	}

	// 계좌 생성 테스트 
	@Test
	public void testAccount() throws Exception {
	}
	
	// 잔고 조회 테스트
	@Test
	public void testGetBalance() throws Exception {
		// if문 대신 asssertEquals 메소드 사용
		assertEquals(10000, account.getBalance());
		
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
	}
	
	// 입금 기능 테스트
	@Test
	public void testDeposit() throws Exception {
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}
	
	// 출금 기능 테스트 
	@Test
	public void testWithdraw() throws Exception {
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
}
