/*Escreva um programa que calcule a área de um quadrado. O valor do lado de um qua
drado deverá ser informado pelo usuário. */
package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

class areaQuadrado{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area;
        System.out.print("Informe um lado do quadrado");
        double lado = input.nextDouble();
        area = lado * lado;
        System.out.println("area do quadrado -> "+ area);
        input.close();
    }
}