/*
 * 1)	Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
 − Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
 − Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
 − Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o)
*/


import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int angle1, angle2, angle3; 
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro angulo: ");
		angle1 = sc.nextInt();
		
		System.out.println("Digite o primeiro angulo: ");
		angle2 = sc.nextInt();
		
		System.out.println("Digite o primeiro angulo: ");
		angle3 = sc.nextInt();
		
		
		if(angle1 == 90 && angle2 == 90 && angle3 == 90) {
			System.out.println("Triângulo Retângulo!");
		}if( angle1 > 90 || angle2 > 90 || angle3 > 90 ) {
			System.out.println("Triângulo Obsutangulo!");
		}else if(angle1 < 90 && angle2 < 90 && angle3 < 90) {
			System.out.println("Triângulo Acutângulo!");
		}
		sc.close();
		
	}

}
