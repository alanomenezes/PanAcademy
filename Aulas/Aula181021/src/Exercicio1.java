/*
1. Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
A. Retorno o valor total da soma de todos os elementos com foreach
B. Retorne a m�dia de todos os elementos
C. Retorne o maior valor e o menor elemento
 */



public class Exercicio1 {

	public static void main(String[] args) {
		
		
		int[] numeros = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		System.out.println("\nN�meros Pares: ");
		for(int numero : numeros){
			if(numero%2 == 0) {
			 System.out.printf(numero+ " ");

			}
		}
		System.out.println("\nN�meros Impares: ");
		for(int numero : numeros){
			if(numero%2 != 0) {
			 System.out.println(numero+" * 2 = "+(numero * 2));

			}
		}
           
           

	}

}
