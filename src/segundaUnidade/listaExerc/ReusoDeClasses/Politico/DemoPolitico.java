package segundaUnidade.listaExerc.ReusoDeClasses.Politico;

public class DemoPolitico {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("italo", 31);
        System.out.println(pessoa);
        Politico politico = new Politico("Italo", 31, "Java");
        System.out.println(politico);
        Prefeito prefeito = new Prefeito("mariana", 31, "uniao", "pau dos ferros");
        System.out.println(prefeito);
        Governador governador = new Governador("nao sei", 22, "pl","nao sei");
        System.out.println(governador);
    }
}
