package segundaUnidade.listaExerc.Cliente;

public class Cliente {
    private int id, idade;
    private String telefone, nome;
    
    public Cliente(int id, String nome, int idade, String telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString(){
        return "|[id]:" + id + "|[nome]:" + nome + "|[idade]:" + idade + "|[telefone]:" + telefone + "|\n"; 
    }
}