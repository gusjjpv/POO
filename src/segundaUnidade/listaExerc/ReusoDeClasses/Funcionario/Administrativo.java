package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno){
        super(nome, salario, matricula);
        this.turno = turno;
        if(this.turno.equalsIgnoreCase("noite")){
            this.adicionalNoturno = adicionalNoturno;
        }else{
            this.adicionalNoturno = 0;
        }
    }

    @Override
    public double ganhoAnual(){
        if(this.turno.equalsIgnoreCase("noite")){
            return super.ganhoAnual() + (this.adicionalNoturno * 12);
        }else{
            return super.ganhoAnual();
        }
    }

    @Override
    public String toString(){
        String infoAdicional = "Turno:" + turno;
        if(this.turno.equalsIgnoreCase("noite")){
            infoAdicional += ", Adicional Noturno:" + adicionalNoturno;
        }
        return super.toString() + infoAdicional;
    }
}
