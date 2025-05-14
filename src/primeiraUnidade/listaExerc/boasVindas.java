package primeiraUnidade.listaExerc;
import java.util.Scanner;

public class boasVindas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.print("Bem vindo " + nome);
        input.close();
    }
}
