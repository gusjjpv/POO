package segundaUnidade.listaExerc.Array_e_ArrayList.Clientes;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoClientes {
    public static void main(String[] args){
        ArrayList<Clientes> listClientes = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            Clientes clienteNovo = new Clientes();
            
            System.out.println("id:");
            clienteNovo.id = input.nextInt();
            if(clienteNovo.id < 0){
                break;
            }
            System.out.println("Nome:");
            clienteNovo.nome = input.next();
            System.out.println("Idade:");
            clienteNovo.idade = input.nextInt();
            System.out.println("telefone:");
            clienteNovo.telefone = input.nextInt();

            listClientes.add(clienteNovo);
        }

        input.close();

        for(Clientes i : listClientes){
            System.out.println(i.toString());
        }
    }
}
