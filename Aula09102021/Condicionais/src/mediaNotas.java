//Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular 
//a m�dia do aluno e dar o seguinte resultado:
//  A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
// A mensagem "Reprovado", se a m�dia for menor do que sete;
// A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.


import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite suas tres notas: ");
		double n1  = sc.nextDouble();
		double n2  = sc.nextDouble();
		double n3  = sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		if (media >= 0 && media <= 10) {		
		
		if (media >= 7 && media < 10) {
			System.out.println("Aluno foi Aprovado!");
		}else if (media < 7){
			System.out.println("Aluno foi Reprovado!");
		}else {
			System.out.println("Aluno foi Aprovado com Distin��o!");
		}
		}else {
			System.out.println("Valor invalido");
		}
		sc.close();
	}

}
