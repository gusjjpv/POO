package segundaUnidade.listaExerc.ReusoDeClasses.Pc;

public class TestaEquipamento {
    public static void main(String[] args){
        Equipamento equipamento = new Equipamento("mouse", "razer");
        Computador pc = new Computador("ryzen5", 12,equipamento.getItem(), equipamento.getMarca());
        System.out.println(equipamento);
        System.out.println(pc);
    }
}
