package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class EventoHeranca extends DataHora{
    private String nomeEvento;

    public EventoHeranca(String nome, int dia, int mes, int ano, int hora, int minuto){
        super(dia, mes, ano, hora, minuto);
        this.nomeEvento = nome;
    }

    public String toString(){
        return ("Evento:" + nomeEvento + "\n" +super.toString());
    }
}
