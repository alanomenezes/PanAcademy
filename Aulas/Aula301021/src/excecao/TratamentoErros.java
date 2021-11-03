package excecao;

public class TratamentoErros {
	
	public static void main(String[] args) {
		Produto p = null;
		
		
	/*	try {
			nomeDoProduto(p);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}*/
		
		//nomeDoProduto(p); //NullPonnterException
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Não deu certo");
		}
		
		System.out.println("Fim");

	}

	
	
	public static void nomeDoProduto(Produto nome) {
		System.out.println(produto.nome);
	}

}
