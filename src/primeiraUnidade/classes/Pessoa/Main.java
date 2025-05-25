package primeiraUnidade.classes.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa marcelo = new Pessoa("marcelo", 1.80);
        System.out.println(marcelo.getNome());
        System.out.println(marcelo.getAltura());
        System.out.println(marcelo.toString());
    }
}
