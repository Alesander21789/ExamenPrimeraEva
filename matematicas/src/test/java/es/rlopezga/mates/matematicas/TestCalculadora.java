package es.rlopezga.mates.matematicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculadora {

	private Calculadora c;
	@BeforeEach
	void setUp() throws Exception {
		
		c = new Calculadora();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		c = null;
	}

	

	@Test
	void testSolucion1() {
		
		//La primera ecuacion
		assertEquals(c.solucion1(1, -5, 6), 3);
		//La segunda ecuación
		assertEquals(c.solucion1(2, -7, 3), 3);
		//La tercera ecuacion
		assertEquals(c.solucion1(-1, -7, -10), -5);
	}

	@Test
	void testSolucion2() {
		
		//La primera ecuación
		assertEquals(c.solucion2(1, -5, 6), 2,2);
		//La segunda ecuación
		assertEquals(c.solucion2(2, -7, 3), 0.5);
		//La tercera ecuación
		assertEquals(c.solucion2(-1, -7, -10), -2);
	}

	@Test
	void testEsPrimo() {
		assertEquals(c.esPrimo(2), true);
		assertEquals(c.esPrimo(7), true);
		assertEquals(c.esPrimo(19), true);
		
	}
	@Test
	void testNOPrimo() {
		assertNotEquals(c.esPrimo(15), true);
		assertNotEquals(c.esPrimo(16), true);
		assertNotEquals(c.esPrimo(20), true);
		
	}
	@Test
	void testPrimoIncorrecto() {
		assertNotEquals(c.esPrimo(15), true);
		assertNotEquals(c.esPrimo(16), true);
		assertNotEquals(c.esPrimo(20), true);
		
	}
	
	@Test
	void testSolucciónDosIncorrecta() {
		
		assertThrows(IllegalArgumentException.class, ()-> {
			
			c.esPrimo(1);
		});
		
	}
	
	
	
	@Test
	void testSolucciónIncorrecta() {
		
		assertThrows(ArithmeticException.class, ()-> {
			
			c.solucion1(1, 1, 1);
		});
		
	}
	
	
}
