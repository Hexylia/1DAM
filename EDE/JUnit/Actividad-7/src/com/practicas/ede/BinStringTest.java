package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class BinStringTest {

	private BinString binString;
	
	public BinStringTest(){
		// Completar
		binString = new BinString();
	}
	
	@Test
	public void  sumarTest(){
		// Test de la función sumar

		int expected = 0;
		expected = 196;
		assertEquals(expected, binString.sumar("ABA"));
		
	}
	
	@Test
	public void aBinarioTest() {
		// Test de la función aBinario

		String expected = "1100";
		assertEquals(expected, binString.aBinario(12));
	}
	
	@Test
	public void convertirTest() {
		// Test de la función convertirTest

		String expected = "1011000";
		assertEquals(expected, binString.convertir("X"));
		expected = "";
		assertEquals(expected, binString.convertir("QUESO"));
	}
}
