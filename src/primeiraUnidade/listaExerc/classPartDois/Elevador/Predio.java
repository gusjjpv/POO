package primeiraUnidade.listaExerc.classPartDois.Elevador;

public class Predio{
    public static void main(String[] args){
        Elevador elevador = new Elevador(4, 40);
        elevador.entra();
        System.out.println(elevador.toString());
        elevador.entra();
        System.out.println(elevador.toString());
        elevador.entra();
        System.out.println(elevador.toString());
        elevador.entra();
        System.out.println(elevador.toString());
        elevador.entra();
        System.out.println(elevador.toString());
        elevador.sai();
        System.out.println(elevador.toString());
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        System.out.println(elevador.toString());
        elevador.desce();
        System.out.println(elevador.toString());
    }
}
