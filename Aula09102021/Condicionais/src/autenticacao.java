//Escreva um programa que verifique a validade 
//de uma senha fornecida pelo usu�rio. A senha 
//v�lida � o n�mero 1234.	Devem ser	impressas 
//as seguintes	mensagens: ACESSO	PERMITIDO	
//caso	a	senha	seja	v�lida. ACESSO	NEGADO	
//caso	a	senha	seja	inv�lida.

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
