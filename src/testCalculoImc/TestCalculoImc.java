package testCalculoImc;

import CalculoImc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import CalculoImc.ValoresImc;

public class testCalculoImc {

	public double peso = 65;
	public double altura = 1.70;

	@Test
	public void testcalculoImc() {
		final double DELTA = 0.5; // DELTA é uma constante tipo double
		ValoresImc massacorporal = new ValoresImc (peso, altura);
		double valorObtido = massacorporal.calculaImc();
		double valorEsperado = 22.49;

		assertEquals(valorEsperado, valorObtido, DELTA);
	}

}
