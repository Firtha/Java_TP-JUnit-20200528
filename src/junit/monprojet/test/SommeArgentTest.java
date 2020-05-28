package junit.monprojet.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

public class SommeArgentTest {
	SommeArgent objectA;
	SommeArgent objectB;
	SommeArgent objectC;
	SommeArgent objectD;
	
	@Before
	public void createCommonSommeArgent() {
		objectA = new SommeArgent(420, "GreenTokens");
		objectB = new SommeArgent(24, "EUR");
		objectC = new SommeArgent(10000, "EUR");
		objectD = new SommeArgent(420, "GreenTokens");
	}
	
	@Test
	public void testCreatedSommeArgent() throws UniteDistincteException {
		// Success expected
		Assert.assertEquals(objectA, objectD);
		Assert.assertTrue(objectA.equals(objectD));
		Assert.assertFalse(objectA.equals(objectB));
		Assert.assertFalse(objectA.equals(objectC));
		
		
		System.out.println("First tests OK");
	}
	
	@Test(expected = UniteDistincteException.class)  
	public void divisionWithException() throws UniteDistincteException {  
		SommeArgent firstValue = new SommeArgent(777, "EUR");
		SommeArgent secondValue = new SommeArgent(333, "USD");
		SommeArgent resultedValue = new SommeArgent(1000, "EUR");
		
		firstValue.add(secondValue);
		
		System.out.println("Last tests OK");
	}
	
	
	@After
	public void deleteCommonSommeArgent() {
		objectA = null;
		objectB = null;
		objectC = null;
		objectD = null;
	}
}
