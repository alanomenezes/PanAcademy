
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtsides;
		
		System.out.println("Digite a quantidade de lados da figura: ");
		qtsides = sc.nextInt();
		
		if(qtsides < 3) {
			System.out.println("N�o � um pol�gono");
		}if(qtsides > 5) {
			System.out.println("Pol�gono n�o identificado");
		}else {
			System.out.println("� um pol�gono.");
		}
		sc.close();
	}

}
