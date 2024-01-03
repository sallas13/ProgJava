/*******************************************************************************
* 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
*   O módulo de um número x é:
*   x se x é maior ou igual a zero
*   x * (-1) se x é menor que zero
*******************************************************************************/

import java.util.Scanner;

class Modulo {
  public static void main(String [] args) {

    Scanner teclado = new Scanner(System.in);;
    int Mod = 0;

    System.out.println("Digite um numero para saber seu modulo: ");
    Mod = teclado.nextInt();

    if (Mod >= 0) {
      System.out.println("O modulo é: " + Mod);
    } else {
      System.out.println("O modulo é: " + Mod * (-1));
    }

  }
}