/*******************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/

import java.util.Scanner;

class Troca {
  public static void main (String [] args) {
    
    Scanner teclado = new Scanner(System.in);
    int a, b, c = 0;

    System.out.println("Digite o valor da variavel A: ");
    a = teclado.nextInt();
    System.out.println("Digite o valor da variavel B: ");
    b = teclado.nextInt();

    c = a;
    a = b;
    b = c;

    System.out.println("Com a troca a variavel A ficou com: " + a);
    System.out.println("Com a troca a variavel B ficou com: " + b);
  }
}