import static org.junit.Assert.*;

import org.junit.Test;


public class Teste {

	@Test
	public void deveSomar1() {
		int resultado = Calculadora.somar(1,1);
		assertEquals(2, resultado);
		
	}
	@Test
	public void deveSomarDoisMaisDois() {
		int resultado = Calculadora.somar(2,2);
		assertEquals(4, resultado);
	}
	

	@Test
	public void deveMultiplicar() {
		int resultado = Calculadora.multiplicar(3,2);
		assertEquals(6, resultado);
}
	@Test
	public void deveDividir() {
		int resultado = Calculadora.dividir(12,2);
		assertEquals(6, resultado);
}
}
