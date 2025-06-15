package segundaUnidade.listaExerc.ReusoDeClasses.pc;

public class Computador extends Equipamento {
    private String processador;
    private String ram;

    public Computador(String item, String marca, String processador, String ram){
        super(item, marca);
        this.processador = processador;
        this.ram = ram;
    }

    public String getProcessador(){
        return this.processador;
    }

    public String getRam(){
        return this.ram;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public String toString(){
        String res = "Computador:" + processador + "\t" + ram;
        res += "\n" + super.toString();
        return res; 
    }
}
