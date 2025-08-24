package testes;

import fontes.DilemaDoPrisioneiro;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DilemaDoPrisioneiroTest {
    private String nomeTeste;
    private DilemaDoPrisioneiro dilema;
    private int resultadoReal;

    @Before
    public void init() {
        System.out.println("Iniciando o cálculo...");
        dilema = new DilemaDoPrisioneiro();
    }

    @After
    public void finish() {
        System.out.println(nomeTeste);
        System.out.println("Cálculo finalizado. Resultado: " + resultadoReal);
    }

    @Test
    public void testeCalculaPenaCondenacaoMutua() {
        nomeTeste = "Teste de cálculo para pena de condenação mútua";
        resultadoReal = dilema.calculaPena(DilemaDoPrisioneiro.Resposta.DELACAO, DilemaDoPrisioneiro.Resposta.DELACAO);

        int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, resultadoReal, 0);
    }

    @Test
    public void testeCalculaPenaInocencia() {
        nomeTeste = "Teste de cálculo para pena de inocência";
        resultadoReal = dilema.calculaPena(DilemaDoPrisioneiro.Resposta.DELACAO, DilemaDoPrisioneiro.Resposta.NEGACAO);

        int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoReal, 0);
    }

    @Test
    public void testeCalculaPenaCondenacaoIndividual() {
        nomeTeste = "Teste de cálculo para pena de condenação individual";
        resultadoReal = dilema.calculaPena(DilemaDoPrisioneiro.Resposta.NEGACAO, DilemaDoPrisioneiro.Resposta.DELACAO);

        int resultadoEsperado = 10;
        assertEquals(resultadoEsperado, resultadoReal, 0);
    }

    @Test
    public void testeCalculoPenaCumplices() {
        nomeTeste = "Teste de cálculo para pena de cumplices";
        resultadoReal = dilema.calculaPena(DilemaDoPrisioneiro.Resposta.NEGACAO, DilemaDoPrisioneiro.Resposta.NEGACAO);

        int resultadoEsperado = 1   ;
        assertEquals(resultadoEsperado, resultadoReal, 0);
    }
}
