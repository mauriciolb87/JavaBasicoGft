package test.aula01;


import main.aula01.Calculadora;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+2");
		assertEquals(4, soma);
	}
	
	@Test
	public void testeSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2")).thenReturn(10);
		
		int resultado = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
		
		
	}

}
