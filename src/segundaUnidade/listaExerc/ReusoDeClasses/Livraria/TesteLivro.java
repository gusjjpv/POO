package segundaUnidade.listaExerc.ReusoDeClasses.Livraria;

public class TesteLivro {
    public static void main(String[] args){
        LivroLivraria harryPoter = new LivroLivraria("Harry Poter", "sla", "sla", "fantasia", 345, 80, 32);
        System.out.println(harryPoter);
        
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "HarperCollins", 1178, false, 12345);
        System.out.println(livroBiblioteca);
    }
}
