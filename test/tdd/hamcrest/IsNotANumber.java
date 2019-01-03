package tdd.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * 사용자 정의 Matcher 만들기 
 *
 */
public class IsNotANumber extends TypeSafeMatcher<Double> {

	@Override
	public void describeTo(Description description) {
		
		description.appendText("not a number!");
	}

	@Override
	public boolean matchesSafely(Double number) {

		return number.isNaN();
	}
	
	@Factory
	public static <T> Matcher<Double> notANumber() {
		return new IsNotANumber();
	}
	
}
