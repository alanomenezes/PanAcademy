package estruturaDeControle;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Exercicio4 {
 public Exercicio4() {
 }

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int maior = 0;

     for(int i = 0; i < 10; ++i) {
         System.out.printf("Informe o n�mero %d: ", i + 1);
         int num = scan.nextInt();
         if (i == 0 || num > maior) {
             maior = num;
         }
     }

     scan.close();
     System.out.println("O maior n�mero dentre os n�meros informados � " + maior);
 }
}

