package primeiraUnidade.listaExerc.classPartUm.Fatura;

public class Fatura {
    int numIdentificacao;
    String nomeProduto;
    String descricao;
    double precoUnitario;
    int qtdComprada;
    double valorFatura;

    void inicializaFatura(int numIdentificacao, String descricao, String nomeProduto, double precoUnitario, int qtdComprada){ 
        this.numIdentificacao = numIdentificacao;
        this.descricao = descricao;
        this.nomeProduto = nomeProduto;
        this.precoUnitario = (precoUnitario < 0 ? 0.0 : precoUnitario);
        this.qtdComprada = (qtdComprada < 0 ? 0 : qtdComprada);
    }

    double calculaTotal() {
        valorFatura = precoUnitario * qtdComprada;
        return valorFatura;
    }

    void mostraFatura(){
        System.out.println("numero indentificador:" + numIdentificacao +"\nnome: " + nomeProduto + "\ndescricao: " + descricao +"\npreco unidade: " + precoUnitario + "\nquantidade: "+ qtdComprada+"\nfatura total: " + valorFatura);
    }
}
