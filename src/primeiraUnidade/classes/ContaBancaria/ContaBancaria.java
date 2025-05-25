package primeiraUnidade.classes.ContaBancaria;

public class ContaBancaria{
    //atributos
    private String nome;
    private double saldo;
    private boolean especial;

    public ContaBancaria(String nome, double saldo, boolean especial){
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public ContaBancaria(String nome){
        this.nome = nome;
        this.saldo = 0.0;
        this.especial = false;
    }

    public String toString(){
        String res = "[Nome:" + nome + "\nSaldo:" + saldo + "\nEspecial:" + (especial ? "sim" : "nao") + "]";
        return res;
    }
}