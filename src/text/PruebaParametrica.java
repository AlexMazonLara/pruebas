package text;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import modelo.Persona;
import modelo.calculadora;

public class PruebaParametrica {

	@Test
	@DisplayName("Probamos el metodo suma de la calculadora")
	void testSuma() {
	calculadora calcu=new calculadora();
	int[][]datos= {{3,2,5},{10,5,15},{10,-20,-10}};
	System.out.println("tesDiv()");
	int x=0;
	for(int[]prueba:datos) {
		int suma=calcu.suma(prueba[0], prueba[1]);
		int esperado=prueba[2];
		assertEquals(esperado, suma,"Prueba "+x);
		x++;
	}
	}
@ParameterizedTest
@ValueSource(strings = {"31123456V","31456789B","31147258Z","41642555C"})
void testDni(String dni) {
	assertTrue(Persona.compruebaDni(dni));
}

	@ParameterizedTest
	@DisplayName("Probamos el metodo suma parametizado")
	@ValueSource(strings = {"3,2,5","4,5,8","-2,-3,-5"})
	void testSuma2(String datos) {
		calculadora calcu=new calculadora();
		System.out.println("testDiv()");
		String[]prueba=datos.split(",");
		int n=Integer.parseInt(prueba[0]);
		int m=Integer.parseInt(prueba[1]);
		int esperado=Integer.parseInt(prueba[2]);
			int suma=calcu.suma(n,m);
			assertEquals(esperado, suma);
	}
	@ParameterizedTest
	@DisplayName("Probamos el metodo suma parametizado csv")
	@CsvSource({
		"3, 2, 5",
		"4, 5, 9",
		"-2, -3, -5"
	})
	void testSuma3(int n, int m, int esperado) {
		calculadora calcu=new calculadora();
		int suma=calcu.suma(n,m);
		assertEquals(esperado, suma);
	}
	@ParameterizedTest
	@CsvSource({
		"1, Empleado 1, 30000",
		"2, Empleado 2, 40000",
		"3, Empleado 3, 50000",
		"4, Empleado 4, 50000",
	})
	void test1(Long id, String name, Integer salary) {
		System.out.println("id: "+ id + ",name: " + name + ", salary: " +salary);
		
	}
	@ParameterizedTest
	@MethodSource("namesProvide")
	void testStream(int[] dato) {
		calculadora calcu=new calculadora();
		int suma= calcu.suma(dato[0],dato[1]);
		assertEquals(dato[2], suma);
	}
	private static Stream<int[]> namesProvide(){
		int[][]parametros= {{1,2,3},{2,2,4}};
		return Arrays.stream(parametros);
	}
}
