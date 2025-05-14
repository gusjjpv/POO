package primeiraUnidade.introjava;

import java.util.Scanner;
public class comparandoStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um texto:");
        String text1 = input.nextLine();
        System.out.print("Informe um texto:");
        String text2 = input.nextLine();
        
        //System.out.printf("String 1: %s\nString 2: %s", text1, text2);
        if(text1.equals(text2)){
            System.out.println("As string sao iguais");
        }else{
            System.out.println("As string nao sao iguais");
        }
        input.close();

    }
}
