package segundaUnidade.listaExerc.ReusoDeClasses.Politico;

public class DemoLegislativo {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Kesley", 20);
        System.out.println(pessoa);
        Politico politico = new Politico("Gefinho", 26, "Uniao");
        System.out.println(politico);
        Prefeito prefeito1 = new Prefeito("Netinho Macario", 34, "Uniao", "Agua Nova");
        System.out.println(prefeito1);
        Governador governador = new Governador("Alisson", 36, "Uniao", "Rio Grande do Norte");
        System.out.println(governador);
    }
}
