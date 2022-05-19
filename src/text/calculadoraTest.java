package text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.calculadora;

class calculadoraTest {

	@Test
	void testEstudioAssert() {
		
		calculadora calcu =new calculadora();
		int suma=calcu.suma(15, 10);
		int esperado=25;
		assertEquals(esperado, suma);
		suma=calcu.suma(-15, 10);
		esperado=5;
		assertEquals(esperado, suma,"Positivo y Negativo");
		suma=calcu.suma(-15, -10);
		esperado=-25;
		assertEquals(esperado, suma,"Hemos mandado dos negativos");
		
	}
	 
	/*@Test
	void testEstuduiAssert2() {
		calculadora calcu=new calculadora();
		int suma=calcu.suma(1, 5);
		assertTrue(suma>10);
		//calcu=null;
		assertNotNull(calcu,"La calculadora no esta instanciada");
	}
	*/
	/*@Test
		public void testSumaDouble() {
		calculadora calcu=new calculadora();
		System.out.println("SumaDouble()");
		double resultado = calcu.suma(3.501, 1.0);
		double esperado = 4.5; 
		
		//assertEquals(esperado, resultado);
		//assertEquals(esperado, resultado, 0.001);
		
		assertEquals(esperado, resultado, 0.0001,"Error de precision");
	}
	*/
	/*@Test
	 void assertAllSumaTest() {
		calculadora calcu=new calculadora();
		int suma=calcu.suma(3, 12);
		int esperado=6;
		assertAll(
				()->assertEquals(esperado, suma,"Error en la suma"),
				
				()->assertTrue(suma>10,"Fallo la condicion")
				);
	}*/
	@Test
	void testDivisionPorCero() {
		calculadora calcu=new calculadora();
		assertThrows(ArithmeticException.class, ()->calcu.div(10, 2),"Se esperaba que se lanzara AritmeticException");
		
	}
}
