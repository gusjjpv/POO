/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */
package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

public class MinEmDias {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o intervalo: ");
        int intervalo = input.nextInt();

        int converterDias = (intervalo / 1440);
        int minutosrestante = (intervalo % 1440);
        int converterHoras = (minutosrestante / 60);
        int converterMinutos = (minutosrestante % 60);

        System.out.printf("%d minutos = %d dias, %d horas e %d minutos", intervalo, converterDias, converterHoras, converterMinutos);
        input.close();
    }
}
