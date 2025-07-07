package segundaUnidade.listaExerc.ReusoDeClasses.Pc;

public class Equipamento {
    private String item, marca;

    public Equipamento(String item, String marca){
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

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        return ("{Equipamento:" + item + "\t" + marca+"}");
    }
}
