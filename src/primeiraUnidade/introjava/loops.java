package primeiraUnidade.introjava;

public class loops {
    //o while é a msm coisa que em C
    public static void main(String[] args){
        int contador = 1;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        do{
            System.out.println("Valor: " + contador);
            contador++;
        }while(contador <= 11);

        for(int i= 1;i<=30;i++){
            System.out.println("valor: " + i);
        }

    }
}
