package segundaUnidade.listaExerc.Array_e_ArrayList.EntradaAgenda;

public class EntradaAgenda{
    private String assunto;
    private int dia, mes, ano, hora;

    public EntradaAgenda(int hora, String assunto, int dia, int mes, int ano){
        this.hora = hora;
        this.assunto = assunto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        if(this.dia == dia && this.mes == mes && this.ano == ano){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String res = "[Assunto: " + this.assunto + "]" + "\n[Data:" + dia + "/" + mes+ "/" + ano + "]" +"[Horario:" + hora + "]";
        return res;
    }
}