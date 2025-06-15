package segundaUnidade.listaExerc.ReusoDeClasses.Livraria;

public class LivroLivraria extends Livro {
    private float preco;
    private int qtdEmEstoque;

    public LivroLivraria(String titulo, String autor, String editora, String genero, int paginas, float preco, int quantidade){
        super(titulo, autor, editora, genero, paginas);
        this.preco = preco;
        this.qtdEmEstoque = quantidade;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPreco:" + this.preco + "\nQuantidade Em Estoque:" + qtdEmEstoque;
    }
}
