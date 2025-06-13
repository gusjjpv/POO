package segundaUnidade.ArraysEArrayLists.Extrato;

import java.util.ArrayList;

public class Extrato {
    private float saldoFinal;
    private ArrayList<Float> transacoes;

    public Extrato(){
        saldoFinal = 0;
        transacoes = new ArrayList<>();
    }

    public void transacoes(float valor){
        if(saldoFinal+valor>=0){
            saldoFinal += valor;
            transacoes.add(valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public String toString(){
        String res = "=============\n";
        for(Float f:transacoes){
            res += f+"\n";
        }

        res += "Saldo: " + this.saldoFinal;
        return res;
    }
}
