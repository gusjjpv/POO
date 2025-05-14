/*Escreva um programa que receba um ângulo em graus e o converta para sua represen
tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
 cotangente do ângulo. */
package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

public class grausRadiano{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o grau: ");
        double graus = input.nextDouble();
        double radiano;
        radiano = Math.toRadians(graus);
        System.out.println("Radiano -> " + radiano);

        System.out.println("Seno -> " + Math.sin(graus));
        System.out.println("Cosseno -> " + Math.cos(graus));
        System.out.println("tangente -> " + Math.tan(graus));
        System.out.println("Cossecante -> " + (1/ Math.sin(radiano)));
        System.out.println("Secante -> " + 1 / Math.cos(radiano));
        System.out.println("Cotangente -> " + Math.cos(graus) / Math.sin(graus));
        System.out.println("");
        input.close();
    }
}
