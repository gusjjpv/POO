package primeiraUnidade.listaExerc.introjava.slide;
import java.util.Scanner;

class distPontos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        
        System.out.print("Informe o ponto x1:");
        x1 = input.nextDouble();
        System.out.print("Informe o ponto y1:");
        y1 = input.nextDouble();
        System.out.print("Informe o ponto x2:");
        x2 = input.nextDouble();
        System.out.print("Informe o ponto y2:");
        y2 = input.nextDouble();
        distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
        System.out.printf("A distância entre os pontos (%.2f, %.2f) e (%.2f, %.2f) é: %.4f\n", x1, y1, x2, y2,
                distancia);
        input.close();
    }
}