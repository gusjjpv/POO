package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

public class DoisPontos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String lado = null, altura = null;
        System.out.println("Informe o X1:");
        double x1 = input.nextDouble();
        System.out.println("Informe o Y1:");
        double y1 = input.nextDouble();

        System.out.println("Informe o X2:");
        double x2 = input.nextDouble();
        System.out.println("Informe o Y2:");
        double y2 = input.nextDouble();

        if(x2 > x1){
            lado = "a Direita";
        }else if(x1 > x2){
            lado = "a Esquerdo";
        }else if(x1 == x2){
            lado = "no msm ponto";
        }
        if(y2 > y1){
            altura = "a Cima";
        }else if(y1>y2){
            altura = "a Baixo";
        }else if(y1 == y2){
            altura ="no msm ponto";
        }

        System.out.println("O segundo ponto esta " + altura + " e " + lado + " do primeiro ponto");

        input.close();
    }
}
