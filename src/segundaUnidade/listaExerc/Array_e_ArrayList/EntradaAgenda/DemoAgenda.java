package segundaUnidade.listaExerc.Array_e_ArrayList.EntradaAgenda;

public class DemoAgenda{
    public static void main(String[] args){
        Agenda minhaAgenda = new Agenda();

        EntradaAgenda comp1 = new EntradaAgenda(13, "enviar lista", 11, 6, 2025);
        EntradaAgenda comp2 = new EntradaAgenda(13, "prova", 14, 6, 2025);
        EntradaAgenda comp3 = new EntradaAgenda(13, "aula", 11, 6, 2025);

        minhaAgenda.adicionar(comp3);
        minhaAgenda.adicionar(comp2);
        minhaAgenda.adicionar(comp1);

        System.out.println("\n Lista compromissos para 11/6/2025");
        minhaAgenda.listaDias(11, 6, 2025);
        
    }
}