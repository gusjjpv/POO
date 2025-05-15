package primeiraUnidade.listaExerc.outros;
import java.util.Scanner;

class FatorialRecursivo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, fat;

        System.out.print("Valor:" );
        num = input.nextInt();

        fat = fatorial(num);

        System.out.println("Fatorial é " + num + " é igual " + fat);
        input.close();
    }

    public static int fatorial(int n){
        if(n==0){
            return 1;
        } else{
            return n*fatorial(n-1);
        }

    }
}