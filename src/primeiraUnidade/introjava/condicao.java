package primeiraUnidade.introjava;
import java.util.Scanner;

public class condicao{
    public static void main(String[] args){
        int nota;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua nota: ");
        nota = input.nextInt();

        if( nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        if (nota >= 8 && nota < 10){ // comparador logico `e` == `&&`
            System.out.println("Nota Exelente");
        } else if (nota == 10){
            System.out.println("Nota maxima");
        } else if(nota == 7){
            System.out.println("Parabens");
        } else{
            System.out.print("BURROOOOO");
        }
        input.close();
    }
}
