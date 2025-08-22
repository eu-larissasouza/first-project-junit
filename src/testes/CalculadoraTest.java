package testes;

// principal biblioteca do Junit para os nossos testes
import static org.junit.Assert.*;

import fontes.Calculadora;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private String nomeTeste;
	private Calculadora calc;
	private double resultadoReal;

	// executado antes dos testes
	@Before
	public void initTest(){
		System.out.println("\nIniciando o cálculo");
		calc = new Calculadora();
	}

	@After
	public void finishTest(){
		System.out.println(nomeTeste);
		System.out.println("Cálculo finalizado. Resultado: "+resultadoReal);
	}

	@Test
	// teste de soma
	public void testSomar3Com2() {
		nomeTeste = "Somar 3 Com 2";
		resultadoReal = calc.somar(3, 2);

		double resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de soma
	public void testSomar3ponto5por2ponto5() {
		nomeTeste = "Somar 3.5 por 2.5";
		resultadoReal = calc.somar(3.5, 2.5);

		double resultadoEsperado = 6;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de subtracao
	public void testSubtracao3ponto5por2ponto5() {
		nomeTeste = "Subtracao 3.5 por 2.5";
		resultadoReal = calc.subtrair(3.5, 2.5);

		double resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de divisao
	public void testDivisao6por2() {
		nomeTeste = "Divisao 6 por 2";
		resultadoReal = calc.dividir(2, 6);

		double resultadoEsperado = 3;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

}
