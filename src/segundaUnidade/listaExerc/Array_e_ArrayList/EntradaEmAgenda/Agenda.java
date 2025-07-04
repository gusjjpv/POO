package segundaUnidade.listaExerc.Array_e_ArrayList.EntradaEmAgenda;
import java.util.ArrayList;
public class Agenda{
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda(){
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda novoCompromisso){
        this.compromissos.add(novoCompromisso);
    }

    public void listaDia(int dia, int mes, int ano){
        for(EntradaEmAgenda entrada : this.compromissos){
            if(entrada.ehNoDia(dia, mes, ano)){
                System.out.println(entrada.toString());
            }
        }
    }
    

}