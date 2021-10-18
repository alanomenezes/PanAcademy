/*
 * 2)	Faça um  algoritmo que escreva as seguintes mensagens :
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO
*/


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtsides;
		
		System.out.println("Digite a quantidade de lados da figura: ");
		qtsides = sc.nextInt();
		
		if(qtsides < 3) {
			System.out.println("Não é um polígono");
		}if(qtsides > 5) {
			System.out.println("Polígono não identificado");
		}else {
			System.out.println("É um polígono.");
		}
		sc.close();
	}

}
