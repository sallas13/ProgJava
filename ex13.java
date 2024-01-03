/*******************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/

import java.util.Scanner;

class Decrescente {
  public static void main (String [] args ) {

    Scanner teclado = new Scanner (System.in);
    int Num1, Num2, Num3, Num4 = 0;
    
    System.out.println("Digite o primeiro numero: ");
    Num1 = teclado.nextInt();
    System.out.println("Digite o segundo numero: ");
    Num2 = teclado.nextInt();
    System.out.println("Digite o terceiro numero: ");
    Num3 = teclado.nextInt();

    if (Num1 < Num2) {
      Num4 = Num1;
      Num1 = Num2;
      Num2 = Num4;
    }
    if (Num2 < Num3) {
      Num4 = Num2;
      Num2 = Num3;
      Num3 = Num4;
    }
    if (Num1 < Num2) {
      Num4 = Num1;
      Num1 = Num2;
      Num2 = Num4;
    }


    System.out.println("\n" + Num1);
    System.out.println(Num2);
    System.out.println(Num3);

  }
}