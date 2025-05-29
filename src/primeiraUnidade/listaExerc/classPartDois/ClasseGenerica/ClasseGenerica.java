package primeiraUnidade.listaExerc.classPartDois.ClasseGenerica;

public class ClasseGenerica <G>{
    G first, second, third;

    public ClasseGenerica(G f, G s, G t) {
        this.first = f;
        this.second = s;
        this.third = t;
    }

    public void contaIgual() {
        int contador;
        if(first.equals(second) && first.equals(third)){
            contador = 3;
        }else if(first.equals(second) || first.equals(third) || second.equals(third)){
            contador = 2;
        }else {
            contador = 0;
        }
        System.out.println("Total de elmentos iguais: " + contador);
    }


}
