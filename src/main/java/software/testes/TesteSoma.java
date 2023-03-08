package software.testes;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import software.operacoes.Soma;

public class TesteSoma {

	public void testarSoma() {

		BigDecimal x = BigDecimal.valueOf(5);
		BigDecimal y = BigDecimal.valueOf(10);
		BigDecimal z = x.add(y);

		Soma soma = new Soma();
		BigDecimal resultadoFuncao = soma.somar(x, y);

		if (resultadoFuncao.equals(z)) {
			System.out.println("Sucesso! A soma de " + x + " + " + y + " = " + resultadoFuncao);
		} else {
			System.out.println(
					"Falha! A soma de " + x + " + " + y + " != " + z + ". " + "Na verdade ela é igual a: " + z);
		}

	}
	
	@Test
	public void sumTest() {
		BigDecimal x = BigDecimal.valueOf(5);
		BigDecimal y = BigDecimal.valueOf(10);
		BigDecimal z = x.add(y);

		Soma soma = new Soma();
		BigDecimal resultadoFuncao = soma.somar(x, y);
		
		Assert.assertEquals(z, resultadoFuncao);
	}

}
