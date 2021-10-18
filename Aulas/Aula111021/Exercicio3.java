/*
 * 3)	Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
− Triângulo Equilátero: possui os 3 lados iguais.
− Triângulo Isóscele: possui 2 lados iguais.
− Triângulo Escaleno: possui 3 lados diferentes.
 */


import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int side1, side2, side3;
		
        System.out.println("Digite o primeiro lado: ");
        side1 = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        side2 = sc.nextInt();

        System.out.println("Digite o terceiro lado: ");
        side3 = sc.nextInt();
        
        
        if(side1 == side2 && side2 == side3) {
        	System.out.println("Triângulo Equilátero.");
        }else if(side1 == side2 || side1 == side3 || side2 == side3) {
        	System.out.println("Triângulo Isóscele.");        	
        }if(side1 != side2 && side1 != side3 && side2 != side3) {
        	System.out.println("Triângulo Escaleno."); 
        }     
        sc.close();
	}

}
