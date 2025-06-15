package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class DataHora {
    private int dia, mes, ano, hora, minuto;

    public DataHora(int dia, int mes, int ano,int hora, int minuto){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString(){
        String res = "Data:" + dia + "/" +  mes + "/" + ano + "\t hora: " + hora + ":" + minuto + "\n";
        return res; 
    }
}
