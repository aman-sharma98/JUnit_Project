package PackageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Junits.StringFunctions;

public class ClassBTest {
	
	@Tag("Sanity")
	@Test
	@DisplayName("Test2")
	public void test2() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}
	
}
