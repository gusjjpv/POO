package segundaUnidade.listaExerc.ReusoDeClasses.Pc;

public class Computador extends Equipamento{
    private String processador;
    private int ram;

    public Computador(String processador, int ram, String item, String marca ){
        super(item, marca);
        this.processador = processador;
        this.ram = ram;
    }

    public String getProcessador(){
        return this.processador;
    }

    public int getRam(){
        return this.ram;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public String toString(){
        return (super.toString() + "\n{Computador:" + processador + "\t" + ram + "gb}");
    }
}
