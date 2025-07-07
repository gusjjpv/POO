package segundaUnidade.listaExerc.ReusoDeClasses.Livro;

public class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(String titulo, String autor, int numPaginas, double preco){
        super(titulo, autor, numPaginas);
        this.preco = preco;
    }

    public String toString(){
        return super.toString() + "preco:" + preco;
    }
}
