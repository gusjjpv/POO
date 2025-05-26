package primeiraUnidade.listaExerc.classPartDois.Contador;

public class DemoContador{
    public static void main(String[] args){
        Contador evento = new Contador();
        for(int i = 0; i < 10;i++){
            evento.incremento();
            evento.imprimeContador();
        }
        evento.imprimeContador();
        evento.zerar();
        evento.imprimeContador();

    }
}
