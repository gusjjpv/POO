package segundaUnidade.listaExerc.Array_e_ArrayList.EntradaEmAgenda;

public class EntradaEmAgenda {
    private int hora,dia,mes,ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        if(dia == this.dia && mes == this.mes && ano == this.ano){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Assunto:" + this.assunto + "\nData:" + dia + "/" + mes + "/" + ano; 
    }
}