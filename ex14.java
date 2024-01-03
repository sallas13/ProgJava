/*******************************************************************************
* 14) Escreva um programa que leia dois números e apresente a diferença do
* maior para o menor.
*******************************************************************************/

import java.util.Scanner;

class Ex14 {
  public static void main (String [] args ) {
    Scanner teclado = new Scanner(System.in);
    int Num1, Num2, Result;

    System.out.println("Digite o primeiro número: ");
    Num1 = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    Num2 = teclado.nextInt();
    if (Num1 > Num2) {
    Result = Num1 - Num2;
    System.out.println("A diferença entre " + Num1 + " e " + Num2 + " é: " + Result);
    } else {
      Result = Num2 - Num1;
    System.out.println("A diferença entre " + Num2 + " e " + Num1 + " é: " + Result);
    }
  }
}