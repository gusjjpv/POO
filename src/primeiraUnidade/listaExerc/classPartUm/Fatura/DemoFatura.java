package primeiraUnidade.listaExerc.classPartUm.Fatura;

public class DemoFatura{
    public static void main(String[] args){
        Fatura gusFatura = new Fatura();
        gusFatura.inicializaFatura(1, "bom", "fone", 5, 4);
        gusFatura.calculaTotal();
        gusFatura.mostraFatura();
    }
}
