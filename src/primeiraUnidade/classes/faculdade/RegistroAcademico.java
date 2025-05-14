package primeiraUnidade.classes.faculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    int percentualDeCobranca;

    void inicializaRegistroAcademico(String n,String m, int c, int p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    double calcularMensalidade(){
        return 100.0*codigoCurso*(percentualDeCobranca/100.0);
    }
}
