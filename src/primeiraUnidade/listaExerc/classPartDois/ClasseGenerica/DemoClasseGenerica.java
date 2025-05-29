package primeiraUnidade.listaExerc.classPartDois.ClasseGenerica;

public class DemoClasseGenerica {
    public static void main(String[] args) {
        ClasseGenerica<String> nome = new ClasseGenerica<>("marcelo", "vini", "gusdev");

        ClasseGenerica<Integer> inteiro = new ClasseGenerica<>(2, 2, 2);



        nome.contaIgual();
        inteiro.contaIgual();
    }
    

}
