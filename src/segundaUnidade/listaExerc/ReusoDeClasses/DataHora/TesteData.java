package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class TesteData {
    public static void main(String[] args){
        EventoDelegacao evento1 = new EventoDelegacao("Prova POO", 8, 7, 2025, 14, 0);

        EventoHeranca evento2 = new EventoHeranca("Entregar Projeto POO", 21, 7, 2025, 0, 0);

        System.out.println(evento1);
        System.out.println(evento2);
    }
}
