//1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior e qual o menor.
//Conseguem criar mais de uma solu��o?


public class menorOuMaior {

	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 40;
		int n3 = 10;
		int menor;
		int maior;
		if (n2 > n1) {
			if (n2 > n3) {
			maior = n2;
			if(n1>n3) {
				menor = n3;
			}else {
				menor = n1;
			}
			}else {
			maior = n3;
			if(n1>n3) {
				menor = n3;
			}else {
				menor = n1;
			}
		}
		}else {
			if(n1 > n3) {
				maior = n1;
				if(n2>n3) {
					menor = n3;
				}else {
					menor = n2;
				}
			}else {
				maior = n3;
				if(n1>n2) {
					menor = n2;
				}else {
					menor = n1;
				}
			}
		}
			System.out.println("Maior n�mero � "+maior);
			System.out.println("Menor n�mero � "+menor);
		}

}



