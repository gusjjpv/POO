package segundaUnidade.listaExerc.ReusoDeClasses.Livro;

public class TesteLivro {
    public static void main(String[] args){
        LivroBiblioteca livro1 = new LivroBiblioteca("harry poter", "nao sei", 319, false);
        System.out.println(livro1);
        LivroLivraria livro2 = new LivroLivraria("diario de um banana", "nao sei", 209, 34);
        System.out.println(livro2);
    }
}
