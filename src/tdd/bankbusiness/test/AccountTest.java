package tdd.bankbusiness.test;

import org.junit.Test;

import tdd.bankbusiness.main.Account;

/**
 * 계좌 클래스(Account)에 대한 테스트 케이스 작성을 위해 만든 테스트 클래스 
 *
 */
public class AccountTest {

	@Test
	public void testAccount() throws Exception {
		Account account = new Account();
		if (account == null) {
			throw new Exception("계좌생성 실패");
		}
	}
	
	/* public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount();		// 테스트 케이스 실행 
		} catch (Exception e) {
			System.out.println("실패(X)"); 	// 예외가 발생하면 실패(X)
		}
		System.out.println("성공(O)"); 
	} */
}
