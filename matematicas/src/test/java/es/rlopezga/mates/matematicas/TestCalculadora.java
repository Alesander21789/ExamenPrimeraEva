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
		//assertEquals(c.solucion1(2, -7, 3), 3);
	}

	@Test
	void testSolucion2() {
		//fail("Not yet implemented");
	}

	@Test
	void testEsPrimo() {
		//fail("Not yet implemented");
	}

}
