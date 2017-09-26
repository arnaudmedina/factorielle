package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {

	public long calculeFactorielle(Long n)
	{
		Factorielle factorielle = new Factorielle();
		long resultat = factorielle.calculer(n);
		return resultat;
	}
	
	@Test
	public void factorielle_de_1_doit_etre_egale_a_1() {
		// GIVEN

		Long n = 1L;
		Long ResultatAttendu = 1L;
		
		// WHEN
		Long resultat;
		resultat = calculeFactorielle(n);
		
		// THEN
		assertTrue("Test assertTrue", ResultatAttendu!=resultat);
	}
	
	@Test
	public void factorielle_de_0_doit_etre_egale_a_1() {
		// GIVEN
		Long n = 0L;
		Long ResultatAttendu = 11L;
		
		// WHEN
		Long resultat;
		resultat = calculeFactorielle(n);
		
		// THEN
		assertEquals("Probleme #14 !!!", ResultatAttendu, resultat);
	}
	
	@Test
	public void factorielle_de_2_doit_etre_egale_a_2() {
		// GIVEN
		Long n = 2L;
		Long ResultatAttendu = 2L;
		
		// WHEN
		Long resultat;
		resultat = calculeFactorielle(n);
		
		// THEN
		assertEquals(ResultatAttendu, resultat);
	}
	
	@Test
	public void factorielle_de_3_doit_etre_egale_a_6() {
		// GIVEN
		Long n = 3L;
		Long ResultatAttendu = 6L;
		
		// WHEN
		Long resultat;
		resultat = calculeFactorielle(n);
		
		// THEN
		assertEquals(ResultatAttendu, resultat);
	}
	
	@Test
	public void factorielle_de_4_doit_etre_egale_a_24() {
		// GIVEN
		Long n = 4L;
		Long ResultatAttendu = 24L;
		
		// WHEN
		Long resultat;
		resultat = calculeFactorielle(n);
		
		// THEN
		assertEquals(ResultatAttendu, resultat);
	}
	
	@Ignore("ce test n'est pas encore prêt, nous n'avons pas calculé factoriel 10")
	@Test
	public void factorielle_de_10_doit_etre_egale_a_24() {
		// GIVEN
		Factorielle factorielle = new Factorielle();
		Long n = 4L;
		
		// WHEN
		long resultat = factorielle.calculer(n);
		
		// THEN
		assertEquals(24, resultat);
	}
}
