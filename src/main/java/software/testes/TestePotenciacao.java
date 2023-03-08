package software.testes;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import software.operacoes.Potenciacao;

public class TestePotenciacao {

	public void testarPotenciacao() {

		BigDecimal x = BigDecimal.valueOf(2);
		int y = 3;
		BigDecimal z = x.pow(y);

		Potenciacao potenciacao = new Potenciacao();
		BigDecimal resultadoFuncao = potenciacao.potencializar(x, y);

		if (resultadoFuncao.equals(z)) {
			System.out.println("Sucesso! A potenciação: " + x + " ^ " + y + " = " + resultadoFuncao);
		} else {
			System.out.println(
					"Falha! A potenciação: " + x + " ^ " + y + " != " + z + ". " + "Na verdade ela é igual a: " + z);
		}

	}
	
	@Test
	public void potentiationTest() {
		BigDecimal x = BigDecimal.valueOf(2);
		int y = 3;
		BigDecimal z = x.pow(y);

		Potenciacao potenciacao = new Potenciacao();
		BigDecimal resultadoFuncao = potenciacao.potencializar(x, y);
		
		Assert.assertEquals(z, resultadoFuncao);
	}

}
