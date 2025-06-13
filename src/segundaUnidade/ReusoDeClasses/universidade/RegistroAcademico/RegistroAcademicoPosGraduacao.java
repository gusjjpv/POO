package segundaUnidade.ReusoDeClasses.universidade.RegistroAcademico;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(String nome, String matricula, String curso,String tituloTese, String orientador){
        this.registro = new RegistroAcademico(nome, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(RegistroAcademico aluno, String tituloTese, String orientador) {
        this.registro = aluno;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString(){
        return registro + "tituloTese=" + tituloTese + "\torientador=" + orientador + "\n";
    }
}
