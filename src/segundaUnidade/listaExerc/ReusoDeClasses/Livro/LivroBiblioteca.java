package segundaUnidade.listaExerc.ReusoDeClasses.Livro;

public class LivroBiblioteca extends Livro{
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, int numPaginas, boolean emprestado){
        super(titulo, autor, numPaginas);
        this.emprestado = emprestado;
    }

    public String toString(){
        String res = super.toString();
        if(emprestado){
            res += "emprestado: sim";
            return res;
        }
        return res + "emprestado: nao";
    }
}
