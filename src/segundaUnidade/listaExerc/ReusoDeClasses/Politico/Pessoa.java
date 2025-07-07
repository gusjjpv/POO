package segundaUnidade.listaExerc.ReusoDeClasses.Politico;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "nome:" + nome + " idade:" + idade + "\n";
    }
}
