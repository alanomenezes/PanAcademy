//2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever
//uma mensagem que diga se ela poder� ou n�o votar este ano (n�o	�	necess�rio	
//considerar	o	m�s	em	que	ela nasceu).

public class votacao {
	public static void main(String[] args) {

		int anoNascimento = 1990;
		int idade = (2021 - anoNascimento);
		if (idade < 16) {
			System.out.println("Voc� n�o pode votar, menor de 16 anos");
		} else if(idade >= 18 && idade < 70){
			System.out.println("Voc� pode votar, obrigatorio");
		} else if(idade > 70 || idade < 18 && idade >= 16) {
			System.out.println("Voc� pode votar, mas n�o � obrigatorio");
		} else {
			System.out.println("Idade invalida");
		}
	}

}
