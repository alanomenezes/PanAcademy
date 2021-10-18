
public class impostoDeRenda {

	public static void main(String[] args) {
		double salario = 3200.0;
		if (salario < 2500.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até 350");
		} else if (salario >= 2500.0 && salario <= 3800.0) {
			System.out.println("A sua aliquota é de 18%");
			System.out.println("Você pode deduzir até 500");
		} else {
			System.out.println("A sua aliquota é de 23%");
			System.out.println("Você pode deduzir até 630");
		}
	}

}
