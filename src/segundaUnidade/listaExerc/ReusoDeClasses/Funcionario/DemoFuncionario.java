package segundaUnidade.listaExerc.ReusoDeClasses.Funcionario;

public class DemoFuncionario {
    public static void main(String[] args){
        Administrativo adm = new Administrativo("Vinicius", 1518, 11111, "noite", 400);
        System.out.println(adm);
        adm.ganhoAnual();
    }
}
