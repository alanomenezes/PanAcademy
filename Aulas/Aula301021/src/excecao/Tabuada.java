package excecao;

import java.util.*;

public class Tabuada {

	public static void main(String argumento[]) {
		int num = 0;
		String esp = "";

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\n Entre com um numero entre 1 e 10 ou digite 0 para finalizar: \n");
			try {
				num = sc.nextInt();
				if (num < 0 || num > 10) {
					System.out.println("\n\n\n Digite um numero valido!");
				} else if (num != 0) {					
					System.out.printf("%13s  TABUADA DA MULTIPLICAÇÃO DO NÚMERO " + num,"\n", esp);
					System.out.print("\n");
					for (int x = 1; x <= 10; x++) {
						System.out.println("             " + num + " x " + x + " = " + num * x);
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("\n\n\n   A T E N C A O\n\n Digite somente numeros!");
				sc.nextLine();
				continue;
			}
		} while (num != 0);
		
		System.out.println("FIM DA EXECUÇÂO");

		sc.close();
	}
}