package primeiraUnidade.listaExerc.classPartUm.Aluno;

public class Aluno{
    int matricula;
    String nome;
    double notaProva1;
    double notaProva2;
    double notaTrabalho;
    
    Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    void mostrarDados(){
        System.out.printf("Nome: %s\nMatricula: %d\nNotas:\nP1:%f\nP2:%f\nT:%f\n", nome, matricula, notaProva1, notaProva2, notaTrabalho);
        
        double exameFinal = notaExameFinal(media());
        if(exameFinal == 0){
            System.out.println("Nao necessita de exame final");
        }else{
            System.out.println("Precisa de " + exameFinal + " no exame final para passar.");
        }
    }

    double media(){
        double mediaParcial = (((2.5 * notaProva1) + (2.5*notaProva2) + (2 * notaTrabalho)) / 7);
        return mediaParcial;
    }

    double notaExameFinal(double mediaParcial){
        if ((mediaParcial < 3) || (mediaParcial >= 7)) {
            return 0;
        }
            // calculo para saber a nota no exame final
        return (50 - 6 * mediaParcial) / 4;
    }
}
