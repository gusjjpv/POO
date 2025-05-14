/*Escreva um programa que lê três números e determina qual número é o menor */
package primeiraUnidade.listaExerc.introjava;

import java.util.Scanner;

public class MenorMaior {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o primeiro numero: ");
        double num1 = input.nextInt();
        System.out.print("Informe o segundo numero: ");
        double num2 = input.nextInt();
        System.out.print("Informe o terceiro numero: ");
        double num3 = input.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.printf("%f e maior que %f e %f", num1,num2,num3);
            }
        }else if(num2 > num3){
                System.out.printf("%f e maior que %f e %f",num2, num3, num1);
        }else if(num3 > num1){
                System.out.printf("%f e maior que %f e %f",num3, num1, num2);
        }
        input.close();
    }
}
