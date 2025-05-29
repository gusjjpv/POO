package segundaUnidade.ArraysEArrayLists.estudos;
import java.util.Scanner;
public class ArraysDeClasses {
  public static void main(String[] args){
    Funcionario funcionarios[] = new Funcionario[20];
    Scanner input = new Scanner(System.in);
    int opc;
    int i = 0;
    do{
      System.out.println("Informe o nome:");
      String nome = input.nextLine();
      System.out.println("Informe a funcao:");
      String funcao = input.nextLine();
      funcionarios[i] = new Funcionario(i+1, nome, funcao);

      System.out.println("Quer cadastrar outro funcionario?\n 1-sim 0-nao");
      opc = input.nextInt();
      input.nextLine();
      if(opc == 1){
        i++;
      }
    }while(opc != 0);
    
    System.out.println(funcionarios[0]);
    Funcionario.imprimeFuncionarios(funcionarios);
    input.close();
  }  
}
