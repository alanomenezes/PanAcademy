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
        	System.out.println("Tri�ngulo Equil�tero.");
        }else if(side1 == side2 || side1 == side3 || side2 == side3) {
        	System.out.println("Tri�ngulo Is�scele.");        	
        }if(side1 != side2 && side1 != side3 && side2 != side3) {
        	System.out.println("Tri�ngulo Escaleno."); 
        }     
        sc.close();
	}

}
