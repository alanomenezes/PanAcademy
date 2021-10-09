import java.util.Scanner;

public class autenticacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha de acesso:");
		String senhaDigitada  = sc.nextLine();
		
		String senha = "1234";
		
		if (senhaDigitada.equals(senha) ) {
			System.out.println("ACESSO	PERMITIDO");
		}else {
			System.out.println("ACESSO	NEGADO");
		}	
		sc.close();
	}

}
