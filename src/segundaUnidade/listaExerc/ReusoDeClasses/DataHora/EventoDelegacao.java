package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class EventoDelegacao {
    private String nomeEvento;
    private DataHora dataHoraEvento;

    public EventoDelegacao(String nomeEvento, int dia, int mes, int ano, int hora, int minuto){
        this.nomeEvento = nomeEvento;
        this.dataHoraEvento = new DataHora(dia, mes, ano, hora, minuto);
    }

    public String toString(){
        return ("Evento:" + nomeEvento + "\n" + dataHoraEvento.toString());
    }
}
