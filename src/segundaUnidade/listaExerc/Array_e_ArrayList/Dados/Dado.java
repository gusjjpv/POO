package segundaUnidade.listaExerc.Array_e_ArrayList.Dados;
import java.util.Random;

public class Dado {
    private Random gerador;

    public Dado(){
        this.gerador = new Random();
    }

    public int lancar(){
        return gerador.nextInt(6)+1;
    }
}
