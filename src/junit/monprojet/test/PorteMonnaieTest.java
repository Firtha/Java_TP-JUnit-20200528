package junit.monprojet.test;

import org.junit.Assert;
import org.junit.Test;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

public class PorteMonnaieTest {
	PorteMonnaie testWalletA = new PorteMonnaie();
	PorteMonnaie testWalletB = new PorteMonnaie();

	@Test
	public void testCreatedSommeArgent() {
		SommeArgent saA = new SommeArgent(150, "EUR");
		testWalletA.ajouteSomme(saA);
		
		SommeArgent saB = new SommeArgent(75, "EUR");
		testWalletB.ajouteSomme(saB);
		testWalletB.ajouteSomme(saB);
		
		Assert.assertEquals(testWalletA, testWalletB);
	}
}
