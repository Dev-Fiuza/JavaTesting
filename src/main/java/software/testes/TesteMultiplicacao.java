package software.testes;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import software.operacoes.Multiplicacao;

public class TesteMultiplicacao {

	public void testarMultiplicacao() {

		BigDecimal x = BigDecimal.valueOf(5);
		BigDecimal y = BigDecimal.valueOf(10);
		BigDecimal z = x.multiply(y);

		Multiplicacao multiplicacao = new Multiplicacao();
		BigDecimal resultadoFuncao = multiplicacao.multiplicar(x, y);

		if (resultadoFuncao.equals(z)) {
			System.out.println("Sucesso! A multiplicação: " + x + " * " + y + " = " + resultadoFuncao);
		} else {
			System.out.println(
					"Falha! A multiplicação: " + x + " * " + y + " != " + z + ". " + "Na verdade ela é igual a: " + z);
		}

	}
	
	@Test
	public void multiplyTest() {
		BigDecimal x = BigDecimal.valueOf(5);
		BigDecimal y = BigDecimal.valueOf(10);
		BigDecimal z = x.multiply(y);
		
		Multiplicacao multiplicacao = new Multiplicacao();
		BigDecimal resultadoFuncao = multiplicacao.multiplicar(x, y);
		
		Assert.assertEquals(z, resultadoFuncao);
		
	}

}
