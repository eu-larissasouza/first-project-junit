package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import testes.CalculadoraTest;
import testes.MensagemBoasVindasTest;

@RunWith(Suite.class)
@SuiteClasses({CalculadoraTest.class, MensagemBoasVindasTest.class})
public class AllTests {

}
