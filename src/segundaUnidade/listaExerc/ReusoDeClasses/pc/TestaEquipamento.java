package segundaUnidade.listaExerc.ReusoDeClasses.pc;

public class TestaEquipamento {
    public static void main(String[] args){
        Equipamento equipamento = new Equipamento("mouse gamer", "attack shark");
        Computador pc = new Computador("teclado", "machenike", "amd 5500U", "12");
        
        System.out.println(pc);
        System.out.println(equipamento);
    }
}
