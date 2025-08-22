package testes;

import static org.junit.Assert.*;

import fontes.MensagemBoasVindas;
import org.junit.Test;

public class MensagemBoasVindasTest {

	@Test
	public void testeRetornoMensagemJoao() {
		MensagemBoasVindas mens = new MensagemBoasVindas();
		
		String mensRetornoReal = mens.geraMensagem("Joao");
		String mensRetornoEsperado = "Seja Bem-Vindo(a) Joao a Calculadora!";
		
		assertEquals(mensRetornoReal, mensRetornoEsperado);
	}

}
