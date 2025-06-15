package segundaUnidade.listaExerc.ReusoDeClasses.Livraria;

public class LivroBiblioteca extends Livro{
    private boolean estaEmprestado;
    private int codExemplar;

    public LivroBiblioteca(String titulo, String autor, String genero, String editora, int paginas, boolean estaEmprestado, int codExemplar){
        super(titulo, autor, editora, genero, paginas);
        this.estaEmprestado = estaEmprestado;
        this.codExemplar = codExemplar;
    }

    @Override
    public String toString() {
        return super.toString() + "Status:" +(estaEmprestado ? "Emprestado": "Livre") + "\n" + "Codigo:" + codExemplar;
    }
}
