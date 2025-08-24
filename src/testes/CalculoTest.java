package testes;

import fontes.Calculo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoTest {

    private String nomeTeste;
    private float resultadoReal;

    @Before
    public void init() {
        System.out.println("Iniciando o cálculo...");
    }

    @After
    public void finish() {
        System.out.println(nomeTeste);
        System.out.println("Cálculo finalizado. Resultado: " + resultadoReal);
    }

    @Test
    public void testeExecutaCalculo5com6(){
        nomeTeste = "Executa Calculo 5 com 6";
        resultadoReal = Calculo.ExecutaCalculo(5,6);

        float resultadoEsperado = 11;
        assertEquals(resultadoEsperado, resultadoReal, 0);
    }

}
