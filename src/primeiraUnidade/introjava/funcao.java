package primeiraUnidade.introjava;

import java.util.Scanner;

public class funcao {
    //public static [tipo do retorno]([lista de parametros]){
   //return [valor do return]
    // }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Numero1:");
        num1 = input.nextDouble();
        System.out.print("Numero2:");
        num2 = input.nextDouble();
        System.out.print("Numero3:");
        num3 = input.nextDouble();
        
        double m = media(num1,num2,num3);

        System.out.println("Media de "+ num1 + ", "+ num2 + ", " + num3 + " é " + m);
        
        input.close();
    }
    

    
    public static double media(double n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }
}
