/*******************************************************************************
* 16) Escreva um programa que leia dois números e exiba mensagem informando o
* valor do maior número e o valor do menor número. Se os dois números forem
* iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/

import java.util.Scanner;

class Ex16 {
  public static void main (String [] args) {
    Scanner teclado = new Scanner(System.in);
    int Num1, Num2;

    System.out.println("Digite o primeiro número: ");
    Num1 = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    Num2 = teclado.nextInt();
    
    if (Num1 > Num2) {
      System.out.println("O valor do maior é: " + Num1);
      System.out.println("O valor do menor é: " + Num2);
    } else if (Num2 > Num1) {
      System.out.println("O valor do maior é: " + Num2);
      System.out.println("O valor do menor é: " + Num1);
    } else {
      System.out.println("Os números são iguais!");
      System.out.println("O valor do primeiro é: " + Num1);
      System.out.println("O valor do segundo é: " + Num2);
    }
  }
}