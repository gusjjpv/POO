package segundaUnidade.listaExerc.Array_e_ArrayList.EntradaEmAgenda;

public class DemoAgenda{
    public static void main(String[] args){
        Agenda minhaAgenda = new Agenda();

        EntradaEmAgenda compromisso1 = new EntradaEmAgenda(20, 20,2,2025,"treino");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda(20, 3, 2, 2025, "treino");
        EntradaEmAgenda compromisso3 = new EntradaEmAgenda(11, 20, 2, 2025, "aula");

        minhaAgenda.adicionarCompromisso(compromisso1);
        minhaAgenda.adicionarCompromisso(compromisso2);
        minhaAgenda.adicionarCompromisso(compromisso3);

        minhaAgenda.listaDia(20, 2, 2025);
    }
}
