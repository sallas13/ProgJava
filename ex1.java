/*************************************************************************** 
1-) Faça um programa para calcular o estoque de uma peça, sendo que:
* ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
****************************************************************************/

import java.util.Scanner;

class Estoque {
  public static void main (String [] args) {
    
    Scanner teclado = new Scanner(System.in);
    float Quantidade_Minima, Quantidade_Maxima, Estoque;

    System.out.println("Programa de estoque médio");

    System.out.println("Digite a quantidade máxima: ");
    Quantidade_Maxima = teclado.nextFloat();
    System.out.println("Digite a quantidade mínima: ");
    Quantidade_Minima = teclado.nextFloat();
    Estoque = (Quantidade_Maxima + Quantidade_Minima) / 2;
    System.out.println("A quantidade máxima foi " + Quantidade_Maxima);
    System.out.println("A quantidade mínima foi " + Quantidade_Minima);
    System.out.println("O valor do estoque foi " + Estoque);
  }
}
