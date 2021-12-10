package Junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExamples {
	
	@Test
	public void test() {
		String name1 = "Rajat";
		String name2 = "Rajat";
		
		assertEquals(name1,name2);
		
		String[] expectedarray = {"one","two"};
		String[] actualarray = {"one","two"};
		assertArrayEquals(expectedarray,actualarray);
	}

}