package primeiraUnidade.listaExerc.classPartDois;

public class Elevador{
    private static int numAndarAtual = 0;
    private int totalAndares;
    private int capacidadeElevador;
    private static int qtdPessoasNoElevador = 0;

    public Elevador(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    public void entra(){
        qtdPessoasNoElevador += 1;
        if(qtdPessoasNoElevador > capacidadeElevador){
            qtdPessoasNoElevador -= 1;
            System.out.println("Nao tem mais espaço no elevador");
        }
    }

    public void sai(){
        if(qtdPessoasNoElevador > 0){
            qtdPessoasNoElevador -= 1;
        }else{
            System.out.println("n tem ninguem no elevador");
        }
    }

    public void sobe(){
        if(numAndarAtual == totalAndares){
            System.out.println("Ja esta no ultimo andar");
        }else{
            numAndarAtual += 1;
        }
    }

    public void desce(){
        if(numAndarAtual == 0){
            System.out.println("Ja esta no terreo");
        }else{
            numAndarAtual -= 1;
        }
    }

    public String toString(){
        String res = "Total andares:" + totalAndares + "\nCapacidade:" + capacidadeElevador + "\n=====\nQuantidade Pessoas Atual:" + qtdPessoasNoElevador + "\nAndar Atual:" + numAndarAtual;
        return res;
    }
}
