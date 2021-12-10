package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public interface DefaultTestinterface {
	
	public void method1();
	public void method2();
	
	
	@RepeatedTest(3)
	default void test() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
}
