package segundaUnidade.ReusoDeClasses.universidade.RegistroAcademico;

public class DemoUniversidade {
    public static void main(String[] args){
        RegistroAcademico graduando = new RegistroAcademico("Gustavo", "2023011639", "BTI");
        RegistroAcademicoPosGraduacao posGrauando1 = new RegistroAcademicoPosGraduacao(graduando, "programacao", "cibely");
        System.out.println(posGrauando1);

        RegistroAcademicoPosGraduacao posGraduando2 = new RegistroAcademicoPosGraduacao("thyago", "202301921", "BTI", "programador", "italo");
        System.out.println(posGraduando2);
    }
}
