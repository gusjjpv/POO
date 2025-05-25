package primeiraUnidade.classes.Caixas;

public class CaixaBanco {
    private static int clientesAtendidos = 0;
    private int numeroCaixa;
    
    public CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa "+ numeroCaixa+ "atendendo o cliente "+ ++clientesAtendidos);
    }
    
    public String toString() {
        return "numeroCaixa= " + numeroCaixa;
    }

    
}
