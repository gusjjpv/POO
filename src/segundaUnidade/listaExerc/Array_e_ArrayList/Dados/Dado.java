package segundaUnidade.listaExerc.Array_e_ArrayList.Dados;
import java.util.Random;

public class Dado {
    private final int numerosDeFaces;
    private int valorAtual;
    private final Random gerador;

    public Dado(){
        this.numerosDeFaces = 6;
        this.gerador = new Random();
    }

    public int jogarDado(){
        this.valorAtual = this.gerador.nextInt(this.numerosDeFaces) + 1;
        return this.valorAtual;         
    }
}