package Junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.DynamicTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DynamicTestExamples {
	
	@TestFactory
	public Collection<DynamicTest> method1() {
		
		return Arrays.asList(
				
				DynamicTest.dynamicTest("Possitive Test1", () -> assertTrue(StringFunctions.isPlaindrome("OPPO"))),
				
				DynamicTest.dynamicTest("Possitive Test2", () -> assertTrue(StringFunctions.isPlaindrome("madam"))),
				
				DynamicTest.dynamicTest("Negetive Test1", () -> assertFalse(StringFunctions.isPlaindrome("abcd")))
				
				);
		
	}
	
}
