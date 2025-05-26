package primeiraUnidade.listaExerc.classPartDois.Lampada;

public class DemoLampada{
    public static void main(String[] args){
        Lampada lampada = new Lampada();

        lampada.mostraEstado();
        lampada.acende();
        lampada.apaga();
        lampada.acende();
        lampada.acende();
        lampada.acende();
        lampada.mostraEstado();
    }
}