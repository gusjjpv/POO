package segundaUnidade.listaExerc.Array_e_ArrayList.ProdInteiros;

public class Produto {
    public static int produto(int... numeros){
        int prod = 1;
        for(int i = 0; i < numeros.length; i++){
            prod *= numeros[i];
        }

        return prod;
    }
}
