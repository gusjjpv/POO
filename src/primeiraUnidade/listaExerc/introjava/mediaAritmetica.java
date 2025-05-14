/*
 * Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário.
 */
package primeiraUnidade.listaExerc.introjava;

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro numero:");
        double n1 = input.nextInt();
        System.out.print("Informe o segundo numero:");
        double n2 = input.nextInt();
        System.out.print("Informe o terceiro numero:");
        double n3 = input.nextInt();

        double media = (n1 + n2 + n3) / 3;
        System.out.printf("a media de %.2f, %.2f e %.2f = %.2f", n1, n2, n3, media);
        input.close();
    }
}
