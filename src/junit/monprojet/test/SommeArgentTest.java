package junit.monprojet.test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import junit.monprojet.SommeArgent;

public class SommeArgentTest {

	@Test
	public void test() {
		SommeArgent testObject = new SommeArgent(420, "GreenTokens");
		SommeArgent equalObject = new SommeArgent(420, "GreenTokens");
		SommeArgent diffObject = new SommeArgent(024, "TokensGreen");
		
		// Success expected
		Assert.assertTrue(testObject.equals(equalObject));
		Assert.assertFalse(testObject.equals(diffObject));
		
		// Failures expected
		Assert.assertTrue(testObject.equals(equalObject));
	}
}
