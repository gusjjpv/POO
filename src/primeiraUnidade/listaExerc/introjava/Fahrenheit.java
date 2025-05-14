/*
 * Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit.
 */

package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

class Fahrenheit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Celsius");
        double celsius = input.nextDouble();
        double fah = ((celsius * 9/5) + 32);

        System.out.println(celsius + " em Fahrenheit -> " + fah);
        input.close();
    }
}