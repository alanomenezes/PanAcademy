package estruturaDeControle;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

import java.util.Scanner;

public class WhileEx {
 public WhileEx() {
 }

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int qntdNotas = 0;
     double nota = 0.0D;
     double media = 0.0D;

     while(true) {
         while(true) {
             System.out.println("Informe a nota (Para sair digite -1):");
             nota = scan.nextDouble();
             if (nota >= 0.0D && nota <= 10.0D) {
                 ++qntdNotas;
                 media += nota;
             } else {
                 if (nota == -1.0D) {
                     System.out.println("\n---- Calculando média -----\n");
                     System.out.printf("Média: %.2f \nQuantidade total de notas: %d", media / (double)qntdNotas, qntdNotas);
                     scan.close();
                     return;
                 }

                 System.out.println("Nota inválida. Tente novamente!");
             }
         }
     }
 }
}

