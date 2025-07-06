package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial){
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual(){
        return super.ganhoAnual() + (this.bonusSalarial * 13);
    }

    @Override
    public String toString(){
        return super.toString() + "\nBonus:" + bonusSalarial;
    }
}
