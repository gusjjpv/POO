package segundaUnidade.listaExerc.Array_e_ArrayList.ProdInteiros;

public class ProdInteiros {
    public static int produtoInteiros(int... inteiros){
        int prod = 1;
        for(int i: inteiros){
            prod *= i;
        }

        return prod;
    }
}
