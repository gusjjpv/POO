package primeiraUnidade.classes.Pessoa;

public class Pessoa {
    private String nome;
    private double altura;

    Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return this.nome;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public void setAltua(double altura){
        if(altura != 0 || altura > 0){
            this.altura = altura;
        }
    }

    public String toString(){
        String res = "";
        res = "Nome: " + nome + "\nAltura: " + altura + "\n";
        return res;
    }
}
