package estruturaDeControle;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Exercicio2 {
 public Exercicio2() {
 }

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int soma = 0;

     int num;
     do {
         System.out.println("Informe um número:");
         num = scan.nextInt();
         if (num >= 0) {
             System.out.println("\n----- Somando os números -----");
             System.out.println("Soma dos números: " + (soma += num));
             System.out.println("------------------------------\n");
         }
     } while(num >= 0);

     scan.close();
 }
}

