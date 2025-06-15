package segundaUnidade.listaExerc.ReusoDeClasses.pc;

public class Equipamento {
    private String item;
    private String marca;

    public Equipamento(String item, String marca) {
        this.item = item;
        this.marca = marca;
    }

    public String getItem(){
        return this.item;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setItem(String item){
        this.item = item;
    }

    public String toString(){
        String res = "Equipamento: " + item + "\t" + marca;
        return res;
    }
}
