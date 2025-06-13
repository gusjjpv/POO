package segundaUnidade.listaExerc.Array_e_ArrayList.Cliente;
import java.util.Scanner;
import java.util.ArrayList;

public class DemoCliente {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        int id = 0;
        int idade;
        String nome, telefone;
        System.out.println("Sistema Cadastro clientes");
        while(id >= 0){
            System.out.print("Informe o id:");
            id = input.nextInt();
            input.nextLine();
            if(id < 0){
                break;
            }
            System.out.print("Informe o nome:");
            nome = input.nextLine();
            System.out.print("Informe a idade:");
            idade = input.nextInt();
            input.nextLine();
            System.out.print("Informe o telefone:");
            telefone = input.nextLine();
            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);
        }
        for(Cliente x: clientes){
            System.out.println(x);
        }
        input.close();
    }
}
