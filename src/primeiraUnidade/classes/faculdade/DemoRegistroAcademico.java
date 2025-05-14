package primeiraUnidade.classes.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args){
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "123456", 2, 60);
        double valor = michael.calcularMensalidade();
        System.out.println("Mensalidade de Michael: " + valor);

        RegistroAcademico foguete = new RegistroAcademico();
        double valor2 = foguete.calcularMensalidade();
        System.out.println("Mensalidade de foguete: "+valor2);
    }
}
