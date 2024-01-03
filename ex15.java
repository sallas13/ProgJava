/*******************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e
* apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
* for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
* do recuperação, somar com o valor da média e obter a nova média. Se a nova
* média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
* foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
* mensagem informando esta condição. Apresentar junto com as mensagens o valor
* da média do aluno.
*******************************************************************************/

import java.util.Scanner;

class Ex15 {
  public static void main (String [] args ) {
    Scanner teclado = new Scanner(System.in);
    float Nota1,Nota2,Nota3,Nota4,Media,Recu,Final;

    System.out.println("Digite a primeira nota: ");
    Nota1 = teclado.nextFloat();
    System.out.println("Digite a segunda nota: ");
    Nota2 = teclado.nextFloat();
    System.out.println("Digite a terceira nota: ");
    Nota3 = teclado.nextFloat();
    System.out.println("Digite a quarta nota: ");
    Nota4 = teclado.nextFloat();
    Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
    if (Media >= 7) {
      System.out.println("Parabéns! Você foi aprovado!");
      System.out.println("Sua média foi: " + Media);
    } else {
      System.out.println("Sinto muito! Você não foi aprovado!");
      System.out.println("Sua média foi: " + Media);
      System.out.println("\nDigite o valor da sua recuperação: ");
      Recu = teclado.nextFloat();
      Final = Media + Recu;
      if (Final >= 7) {
        System.out.println("Parabéns! Você foi aprovado!");
        System.out.println("Sua média foi: " + Final);
      } else {
        System.out.println("Sinto muito! Você não foi aprovado!\n");
        System.out.println("Sua média foi: " + Final);
      } 
    }
  }
}