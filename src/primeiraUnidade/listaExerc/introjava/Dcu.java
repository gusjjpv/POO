/* 
    5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
    Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
    variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
    ser reescrito como 312.
*/
package primeiraUnidade.listaExerc.introjava;
import java.util.Scanner;

public class Dcu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int centena, dezena, unidade;

        System.out.print("Digite um numero no formato CDU:");
        int entrada = input.nextInt();
        
        centena = entrada / 100;
        dezena = (entrada % 100) / 10;
        unidade = (entrada % 100) % 10;
        System.out.printf("%d%d%d", unidade, centena,dezena);
        input.close();
    }
}
