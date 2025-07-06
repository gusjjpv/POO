package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void aumentarSalario(double valor){
        salario += valor;
    }

    public double ganhoAnual(){
        return this.salario * 13;
    }

    public String toString(){
        return "Nome:" + nome + "\tSalario:" + salario;
    }
}
