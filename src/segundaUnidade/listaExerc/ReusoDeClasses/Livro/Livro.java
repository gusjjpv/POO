package segundaUnidade.listaExerc.ReusoDeClasses.Livro;

public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String toString(){
        return "Titulo:" + titulo + " autor:" + autor + " paginas:" + numPaginas + "\n";
    }
}
