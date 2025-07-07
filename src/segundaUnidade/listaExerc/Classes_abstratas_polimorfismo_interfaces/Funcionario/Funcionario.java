package segundaUnidade.listaExerc.Classes_abstratas_polimorfismo_interfaces.Funcionario;

public class Funcionario {
    private String nome;
    private int id;
    private double salarioHoraTrabalhada;

    public Funcionario(String nome){
        this.nome = nome;
        this.salarioHoraTrabalhada = 2;
    }

    public Funcionario(String nome, int id,double salarioHoraTrabalhada){
        this.nome = nome;
        this.id = id;
        this.salarioHoraTrabalhada = salarioHoraTrabalhada;
    }

    public double calculaSalario(int horasTrabalhaadas){
        return (horasTrabalhaadas * salarioHoraTrabalhada);
    }

    public String toStirng(){
        return ("funcionario: " + id + "\nnome: "+nome+"\tsalario por hora trabalhada:" + salarioHoraTrabalhada);
    }
}
