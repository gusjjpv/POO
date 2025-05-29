package primeiraUnidade.listaExerc.classPartDois.Contador;

public class Contador{
    private static int contador;

    public void zerar(){
        contador = 0;
    }

    public void incremento(){
        contador += 1;
    }

    public void imprimeContador(){
        System.out.print(contador);
    }
}
