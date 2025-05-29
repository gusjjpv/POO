package segundaUnidade.ArraysEArrayLists.estudos;

public class Funcionario {
    int id;
    String nome;
    String funcao;

    public Funcionario(int d, String nome, String f){
        this.id = d;
        this.nome = nome;
        this.funcao = f;
    }

    public String toString(){
        String res = "Id:"+id+"\tNome:" + nome + "\tFuncao:" + funcao;
        return res;
    }
}
