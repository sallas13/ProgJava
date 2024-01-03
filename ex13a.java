/*******************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

class Ex13a {
  public static void main (String [] args ) {
    Scanner teclado = new Scanner(System.in);
    int a = 3;
    int[] Num = new int[a];

    System.out.println("\n\nOs números em ordem crescente são:\n\n");
    for (int x = 0; x < a; x++) {
      System.out.println("Digite o número " + (x+1) + ": " );
      Num[x] = teclado.nextInt();
    }
    Arrays.sort(Num);

    System.out.println("\n\nOs números em ordem crescente são: \n");
    for(int Nu : Num) {
      System.out.println(Nu);
    }
  }
}