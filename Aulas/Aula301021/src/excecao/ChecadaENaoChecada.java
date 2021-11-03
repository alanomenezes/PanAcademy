package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaENaoChecada {
	
	public static void main(String[] args) {
		
		
		try {
			geraError1();
		} catch (Exception e) {
			throw new RuntimeException("Erro não checado ou não verificado!!!");
		}
		
		try {
			geraError2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void geraError1() {
		throw new RuntimeException("Erro não checado ou não verificado!");
		}
	
	static void geraError2() throws Exception  {
		try {
			throw new Exception("Erro checado ou verificado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
