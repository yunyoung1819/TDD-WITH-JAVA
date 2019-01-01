package tdd.hamcrest.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 * assertThat(테스트대상, Matcher 구문);
 * assertThat("메시지", 테스트대상, Matcher구문);
 */
public class HamcrestTest {
	@Test
	public void testArray() throws Exception {
		assertThat("Start Date 비교", "2019/01/01", is("2019/01/01"));
	}
}
