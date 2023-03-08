package software.main;

import software.testes.TesteMultiplicacao;
import software.testes.TestePotenciacao;
import software.testes.TesteSoma;

public class App {
	
	public static void main(String[] args) {
		
		TesteSoma teste1 = new TesteSoma();
		TesteMultiplicacao teste2 = new TesteMultiplicacao();
		TestePotenciacao teste3 = new TestePotenciacao();
		
		teste1.testarSoma();
		teste2.multiplyTest();
		teste3.testarPotenciacao();
	}

}
