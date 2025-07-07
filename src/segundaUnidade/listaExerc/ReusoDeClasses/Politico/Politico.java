package segundaUnidade.listaExerc.ReusoDeClasses.Politico;

public class Politico extends Pessoa{
    private String partido;

    public Politico(String nome, int idade, String partido){
        super(nome, idade);
        this.partido = partido;
    }

    public String toString(){
        return super.toString() + "partido:"+ partido + "\n";
    }
}
