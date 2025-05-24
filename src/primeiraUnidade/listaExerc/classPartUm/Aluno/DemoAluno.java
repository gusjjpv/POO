package primeiraUnidade.listaExerc.classPartUm.Aluno;

public class DemoAluno{
    public static void main(String[] args){
        Aluno gustavo = new Aluno(2023011632, "Gustavo", 6, 7, 6);
        System.out.println("Media Parcial: " + gustavo.media());
        gustavo.mostrarDados();
    }
}
