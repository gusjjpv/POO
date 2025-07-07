package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Administrativo extends Assistente{
    private String turno;

    public Administrativo(String nome, double salario, int numMatricula, String turno){
        super(nome, salario, numMatricula);
        if(turno.equalsIgnoreCase("dia")){
            this.turno = turno;
        }else{
            this.turno = turno;
            this.aumentarSalario(0.25 * salario);
        }
    }

    @Override
    public void ganhoAnual(){
        double ganhoAnual = getSalario() * 12;
        double bonusNoturno = (turno.equalsIgnoreCase("noite") ? (0.25 * getSalario()) : 0.0);
        System.out.println("Ganho anual = " + ganhoAnual + " + 13 = " + (getSalario() - bonusNoturno) + " = " + (ganhoAnual + getSalario()));
    }
}