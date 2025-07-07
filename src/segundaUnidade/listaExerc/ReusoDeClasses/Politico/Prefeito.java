package segundaUnidade.listaExerc.ReusoDeClasses.Politico;

public class Prefeito extends Politico{
    private String municipio;

    public Prefeito(String nome, int idade, String partido, String municipio){
        super(nome, idade, partido);
        this.municipio = municipio;
    }

    public String toString(){
        return super.toString() + "municipio:" + municipio + "\n";
    }
}
