package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class EventoHeranca extends DataHora {
    private String nomeEvento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String nome){
        super(dia, mes, ano, hora, minuto);
        this.nomeEvento = nome;
    }

    @Override
    public String toString(){
        return "Evento:" + this.nomeEvento + "\tData:" + super.toString();
    }
}
