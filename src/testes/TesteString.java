package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteString {
    private String nomeTeste;
    private String resultadoReal;

    @Before
    public void init() {
        System.out.println("Iniciando o teste...");
    }

    @After
    public void finish() {
        System.out.println(nomeTeste);
        System.out.println("Teste finalizado. Resultado: " + resultadoReal);
    }

    @Test
    public void testeStringsIguais() {
        nomeTeste = "Teste de strings iguais";
        resultadoReal = "Registro salvo com sucesso";

        String resultadoEsperado = "Registro salvo com sucesso";
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testeStringsDiferentes() {
        nomeTeste = "Teste de strings diferentes";
        resultadoReal = "Funcionário já existe";

        String resultadoEsperado = "Registro salvo com sucesso";
        assertEquals(resultadoEsperado, resultadoReal);
    }
}
