package text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import modelo.calculadora;
public class Prueba {
	static calculadora calcu=null;
	@Test
	void testSuma() {
		System.out.println("testSuma()");
		int suma=calcu.suma(10, 15);
		int esperado=25;
		assertEquals(esperado, suma);
	}
	@Test
	void testResta() {
		System.out.println("testResta()");
		int resta=calcu.resta(10, 15);
		int esperado=-5;
		assertEquals(esperado, resta);
	}


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
