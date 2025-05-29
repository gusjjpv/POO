package segundaUnidade.ArraysEArrayLists.estudos;

public class Funcionario {
    private int id;
    private String nome;
    private String funcao;

    public Funcionario(int d, String nome, String f){
        this.id = d;
        this.nome = nome;
        this.funcao = f;
    }
    //passando um arrays como parametro: tipo nome[]
    public static void imprimeFuncionarios(Funcionario array[]){
        for(int i = 1; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public String toString(){
        String res = "Id:"+id+"\tNome:" + nome + "\tFuncao:" + funcao;
        return res;
    }
}
