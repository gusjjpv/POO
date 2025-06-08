package segundaUnidade.listaExerc.ProdInteiros;

public class DemoProduto {
    public static void main(String[] args){
        System.out.println(Produto.produto(1,4,6,8,1,7,43,5));
        System.out.println(Produto.produto(22,31));
        System.out.println(Produto.produto(12,43,55,66,1,0));
        System.out.println(Produto.produto(3, Produto.produto(1,4,6,8,1,7,43,5)));
    }
}
