/*****************************************************************************
 * 10) Escreva um programa que leia dois números inteiros e mostre todos os 
 * relacionamentos de ordem existentes entre eles. Os relacionamentos possiveis
 * são: IGUAL, NÃO IGUAL, MAIOR, MENOR, MAIOR OU IGUAL, MENOR OU IGUAL.
 *****************************************************************************/

 import java.util.Scanner;

 class Relacionados {
  public static void main(String [] args ) {
    Scanner teclado = new Scanner(System.in);
    int Valor1, Valor2;
    boolean Igual = false, Nao_igual = false, Maior = false, Menor = false, 
    Maior_Ou_Igual = false, Menor_Ou_Igual = false;

    System.out.println("Programa para ver as relações númericas");
    
    System.out.println("Digite o primeiro valor: ");
    Valor1 = teclado.nextInt();
    System.out.println("Digite o segundo valor: ");
    Valor2 = teclado.nextInt();

    if (Valor1 == Valor2) Igual = true;
    if (Valor1 != Valor2) Nao_igual = true;
    if (Valor1 > Valor2) Maior = true;
    if (Valor1 < Valor2) Menor = true;
    if (Valor1 >= Valor2) Maior_Ou_Igual = true;
    if (Valor1 <= Valor2) Menor_Ou_Igual = true;

    System.out.println("Igual = " + Igual);
    System.out.println("Não igual = " + Nao_igual);
    System.out.println("Maior = " + Maior);
    System.out.println("Menor = " + Menor);
    System.out.println("Maior ou igual = " + Maior_Ou_Igual);
    System.out.println("Menor ou igual = " + Menor_Ou_Igual);
  }
 }