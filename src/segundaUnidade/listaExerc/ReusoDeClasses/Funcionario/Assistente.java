package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(String nome, double salario ,int numMatricula){
        super(nome, salario);
        this.matricula = numMatricula;
    }

    public void setMatricula(int numMatricula){
        this.matricula = numMatricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public String toString(){
        return super.toString() + "matricula:" + matricula;
    }
}
