package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        String res = super.toString() + "\nMatricula:" + matricula;
        return res;
    }
}
