package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

public class NaipeCarta {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor da carta:\n>>");
        int valor = input.nextInt();
        System.out.print("Informe o naipe da carta:\n>>");
        int naipe = input.nextInt();

        String valoStr;
        switch(valor){
            case 1:
                valoStr = "As";
                break;
            case 11:
                valoStr = "Valete";
                break;
            case 12:
                valoStr = "Dama";
                break;
            case 13:
                valoStr = "Rei";
                break;
            default:
                valoStr = Integer.toString(valor);
        }

        String naipeString;
        switch(naipe){
            case 1:
                naipeString = "Ouros";
                break;
            case 2:
                naipeString = "Paus";
                break;
            case 3:
                naipeString = "Copas";
                break;
            case 4:
                naipeString = "Espadas";
                break;
            default:
                naipeString = "";
            }
            System.out.println(valoStr + " de " + naipeString);
        input.close();
    }
}
