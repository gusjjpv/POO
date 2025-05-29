package primeiraUnidade.listaExerc.classPartDois.Lampada;
import primeiraUnidade.listaExerc.classPartDois.Contador.Contador;

public  class Lampada {
    private boolean ligada;
    private Contador qnt;

    public Lampada() {
        this.qnt = new Contador();
    }

    public boolean estaLigada(){
        if(!ligada){
            return false;
        }else{
            return true;
        }
    }

    public void ligar() {
        if(!ligada) {
            ligada = true;
            qnt.incremento();;
        }else{
            System.out.println("Ligada");
        }
    }

    public void desligar() {
        if(!ligada) {
            ligada = false;

        }else{
            System.out.println("DEsligada");
        }
    }

    
}
