package primeiraUnidade.introjava;

import java.util.Scanner;

public class lerEntradas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine(); //le uma linha de texto

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt(); // le um numero inteiro

        System.out.printf("Ola, meu nome e %s, tenho %d anos", nome, idade);

        /*
        metodos uteis para o Scanner
        .next() //le apenas uma palavra
        .nextDouble() // le um tipo double
        .nextBoolean() // le um tipo Boolean
         */
        input.close();

    }
}
