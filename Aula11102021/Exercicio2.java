
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
