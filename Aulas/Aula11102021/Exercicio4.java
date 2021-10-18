
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		float regularPrice = 0.30f;
		float promoPrice = 0.25f;
		int apples;
		float amount;
		
		System.out.println("Informe a quantidade de maças compradas: ");
		apples = sc.nextInt();
		
		if(apples < 12 && apples > 0) {
			amount = apples * regularPrice;
			System.out.printf("Valor total da compra R$%.2f", amount);
		}else if (apples >12) {
			amount = apples * promoPrice;
			System.out.printf("Valor total da compra R$%.2f", amount);
		}else {
			System.out.println("Valor invalido");
		}
		
		sc.close();

	}

}
