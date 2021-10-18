package estruturaDeControle;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Exercicio3 {
 public Exercicio3() {
 }

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Digite uma palavra:");
     String palavra = scan.nextLine();
     scan.close();
     String[] letra = palavra.split("");
     String[] var7 = letra;
     int var6 = letra.length;

     for(int var5 = 0; var5 < var6; ++var5) {
         String i = var7[var5];
         System.out.println(i);
     }

 }
}
