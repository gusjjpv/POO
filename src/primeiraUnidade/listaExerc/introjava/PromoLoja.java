package primeiraUnidade.listaExerc.introjava;

import java.util.Scanner;

public class PromoLoja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int setor;
        double precoOriginal, precoFinal;
        System.out.print("Informe o Setor Desejado:\nEletros: 222\nCama,mesa e banho: 111\n>>>");
        setor = input.nextInt();
        double desconto = 0;
        if (setor == 222){
            System.out.println("Setor de Eletros\nInforme o valor do produto:");
            precoOriginal = input.nextInt();
            if (precoOriginal > 500){
                desconto = precoOriginal * 0.10;
                precoFinal = precoOriginal - desconto;
                System.out.println("O produto tem um Desconto de 10%. Ficou " + precoFinal);
            }
        } else if (setor == 111){
                System.out.println("Setor Cama,mesa e banho\nInforme o valor do produto:");
                precoOriginal = input.nextInt();
                if (precoOriginal > 100) {
                    desconto = precoOriginal * 0.40;
                    precoFinal = precoOriginal - desconto;
                    System.out.println("O produto tem um desconto de 40%, ficou " + precoFinal);
                } else if (precoOriginal > 50 && precoOriginal < 100) {
                    desconto = precoOriginal * 0.20;
                    precoFinal = precoOriginal - desconto;
                    System.out.println("O produto tme um desconto de 20%, ficou " + precoFinal);
                } else if (precoOriginal < 50) {
                    desconto = precoOriginal * 0.10;
                    precoFinal = precoOriginal - desconto;
                    System.out.println("O produto tem um desconto de 10%, ficou " + precoFinal);
        } else {
                    System.out.print("Setor invalido");
                }
                input.close();
            }
        }
    }
