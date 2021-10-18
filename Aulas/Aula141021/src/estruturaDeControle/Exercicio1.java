package estruturaDeControle;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
 public Exercicio1() {
 }

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     Random random = new Random();
     int numAle = random.nextInt(100);
     int i = 10;

     while(i > 0) {
         System.out.println("Digite o número:");
         int num = scan.nextInt();
         if (num == numAle) {
             System.out.println("Você acertou!! Parabéns");
             break;
         }

         PrintStream var10000 = System.out;
         StringBuilder var10001 = new StringBuilder("Tentativas restantes: ");
         --i;
         var10000.println(var10001.append(i).toString());
         System.out.println("Número informado é " + (num > numAle ? "maior" : "menor"));
         System.out.println("\n-----------------------------\n");
         if (i == 0) {
             System.out.println("O número que você devia adivinhar era " + numAle);
         }
     }

     scan.close();
 }
}

