package primeiraUnidade.listaExerc.classPartDois.Lampada;
import primeiraUnidade.listaExerc.classPartDois.Contador.Contador;

public class Lampada{
    private boolean estadoLampada;
    private Contador qtdLampadaAcendida;

    public Lampada(){
        this.estadoLampada = false;
        this.qtdLampadaAcendida = new Contador();
    }
    public void acende(){
        if(!this.estaLigada()){
            this.estadoLampada = true;
            this.qtdLampadaAcendida.incremento();
        }else{
            System.out.println("Lampada ja esta acessa");
        }
    }

    public void apaga(){
        estadoLampada = false;
    }

    public boolean estaLigada(){
        return estadoLampada;
    }

    public void mostraEstado(){
        System.out.println(estadoLampada ? "A lampada esta acesa" : "A lampada esta apagada");
        System.out.print("A lampada foi acesa ");
        this.qtdLampadaAcendida.imprimeContador();
        System.out.println(" vez(es)");
    }

}
