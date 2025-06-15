package segundaUnidade.listaExerc.ReusoDeClasses.Livraria;

public class Livro {
    private String titulo, autor, editora, genero;
    private int numeroPaginas;
    public Livro(String titulo, String autor, String editora, String genero, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.numeroPaginas = paginas;
    }

    public String toString(){
        return "Titulo:" + this.titulo + "\nAutor:" + this.autor + "\nGenero:" + this.genero + "\nEditora:" + this.editora + "\nNumero De Paginas:" + this.numeroPaginas;
    }
}
