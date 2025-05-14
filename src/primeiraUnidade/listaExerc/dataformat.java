package primeiraUnidade.listaExerc;
import java.util.Scanner;
class dataformat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        System.out.print("Informe o Dia:");
        dia = input.nextInt();
        System.out.print("Informe o Mes:");
        mes = input.nextInt();
        System.out.print("Informe o Ano:");
        ano = input.nextInt();
        String dataformat1 = dia + " de " + mes + " de " + ano;
        String dataformat2;

        if(mes == 1){
            dataformat2 = dia + " de janeiro de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 2){
            dataformat2 = dia + " de Fevereiro de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 3){
            dataformat2 = dia + " de Marco de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 4){
            dataformat2 = dia + " de Abril de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 5){
            dataformat2 = dia + " de Maio de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 6){
            dataformat2 = dia + " de Junho de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 7){
            dataformat2 = dia + " de Julho de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 8){
            dataformat2 = dia + " de Agosto de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 9){
            dataformat2 = dia + " de Setembro de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 10){
            dataformat2 = dia + " de Outubro de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 11){
            dataformat2 = dia + " de Novembro de " + ano;
            System.out.println(dataformat2);
        }else if(mes == 12){
            dataformat2 = dia + " de Dezembro de " + ano;
            System.out.println(dataformat2);
        }else{
            System.out.println("Data invalida");
        }
        //datas formatadas
        System.out.println(dataformat1);

        switch(mes){
            case 1:
                System.out.println("Janeiro tem 31 dias");
                break;
            case 2:
                System.out.println("Fevereiro 28 dias");
                break;
            case 3:
                System.out.println("Marco tem 31 dias");
                break;
            case 4:
                System.out.println("Abril tem 30 dias");
                break;
            case 5:
                System.out.println("Maio tem 31 dias");
                break;
            case 6:
                System.out.println("Junho tem 30 dias");
                break;
            case 7:
                System.out.println("Julho tem 31 dias");
                break;
            case 8:
                System.out.println("Agosto tem 31 dias");
                break;
            case 9:
                System.out.println("Setembro tem 30 dias");
                break;
            case 10:
                System.out.println("Outubro tem 31 dias");
                break;
            case 11:
                System.out.println("Novembro tem 31 dias");
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias");
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }
        input.close();
    }
}
