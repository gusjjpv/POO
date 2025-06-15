package segundaUnidade.listaExerc.ReusoDeClasses.DataHora;

public class TesteData {
    public static void main(String[] args){
        EventoDelegacao evento1 = new EventoDelegacao("Sao Joao", 20, 6, 2025, 22, 0);
        EventoHeranca evento2 = new EventoHeranca(22, 6, 2025, 22, 0, "festa");

        System.out.println(evento1);
        System.out.println(evento2);
    }
}
