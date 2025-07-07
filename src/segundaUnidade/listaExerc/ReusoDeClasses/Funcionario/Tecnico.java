package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Tecnico extends Assistente {
    public Tecnico(String nome, double salario, int numMatricula, Double bonus){
        super(nome, salario, numMatricula);
        this.aumentarSalario(bonus);
    }

    @Override
    public void ganhoAnual(){
        double ganhoAnual = getSalario() * 12;
        System.out.println("Ganho Anual = " + ganhoAnual + " Ganho Anual + 13 = " + (ganhoAnual + getSalario()));
    }
}
