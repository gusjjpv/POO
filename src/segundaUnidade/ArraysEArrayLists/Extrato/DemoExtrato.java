package segundaUnidade.ArraysEArrayLists.Extrato;
import java.util.Scanner;
public class DemoExtrato {
    public static void main(String[] args){
        Extrato ext = new Extrato();
        System.out.println(ext);
        int opcao;
        float valor;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1-Saque");
            System.out.println("2-Deposito");
            System.out.println("3-Visualizar extrato");
            System.out.println("4-encerrar");
            opcao = input.nextInt();

            switch(opcao){
                case 1: //saque
                    System.out.print("Valor: ");
                    valor = input.nextFloat();
                    ext.transacoes(-valor);
                    break;
                case 2://deposito
                    System.out.print("Valor: ");
                    valor = input.nextFloat();
                    ext.transacoes(valor);
                    break;
                case 3://
                    System.out.print(ext);
                    break;
                case 4:
                    System.out.print("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
                }
        }while(opcao != 4);
        input.close();
    }
}
