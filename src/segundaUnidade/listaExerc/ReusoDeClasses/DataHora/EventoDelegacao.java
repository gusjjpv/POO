package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class EventoDelegacao {
    private String nomeEvento;
    private DataHora data;

    public EventoDelegacao(String nomeEvento, int dia, int mes, int ano, int hora, int minuto){
        this.nomeEvento = nomeEvento;
        this.data = new DataHora(dia, mes, ano, hora, minuto);        
    }

    @Override
    public String toString() {
        return "Evento:" + nomeEvento + "\tData:" + data.toString();
    }
}
