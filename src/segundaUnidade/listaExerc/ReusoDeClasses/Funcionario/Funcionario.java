package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double valor){
        salario += valor;
    }

    public void ganhoAnual(){
        double ganhoAnual;
        ganhoAnual = (salario * 12);
        System.out.println("Ganho anual = " + ganhoAnual + "\nGanho anual + 13 = " + (ganhoAnual + salario));
    }

    public double getSalario(){
        return this.salario;
    }

    public String toString(){
        return "nome:" + nome + " salario:" + salario + "\n";
    }
}
