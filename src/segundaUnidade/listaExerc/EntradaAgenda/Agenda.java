package segundaUnidade.listaExerc.EntradaAgenda;
import java.util.ArrayList;

public class Agenda{
    private ArrayList<EntradaAgenda> compromissos;

    public Agenda(){
        this.compromissos = new ArrayList<EntradaAgenda>();   
    }

    public void adicionar(EntradaAgenda compromisso){
        this.compromissos.add(compromisso);
    }

    public void listaDias(int dia, int mes, int ano){
        boolean encontrou = false;
        for(EntradaAgenda entrada: this.compromissos){
            if(entrada.ehNoDia(dia, mes, ano)){
                System.out.println(entrada);
                encontrou = true;
            }
        }
    }
}