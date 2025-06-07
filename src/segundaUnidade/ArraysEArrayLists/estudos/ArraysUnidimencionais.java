package segundaUnidade.ArraysEArrayLists.estudos;

public class ArraysUnidimencionais {
    public static void main(String[] args){
        //declaracao, tem duas formas
        //double[] arrayDeDouble = new double[100];
        int arrayDeInteiros[] = new int[100];

        int array[] = new int[60*2];
        System.out.println(array.length); // em arrays unidimencionais podemos usar o atributo length que ira armazenar o tamanho do array;
        array[23] = 10;
        // se os arrays n forem inicializados, vao receber os valores padroes dos tipos;
        //
        //double[] medidasDeTemperatura;
        //medidasDeTemperatura = new double[24 * 60 * 60];
        //double[] duplicata = medidasDeTemperatura;
        /*
         * quando fazemos esse tipo de inicialização estamos fazendo com que a
         * referência duplicata aponte para o mesmo objeto array na memória para o
         * qual
         * a referência medidasDeTemperatura já aponta, ou seja, nao é uma copia e
         * sim o msm array com referencias diferentes. Ambas as variáveis agora se
         * referem exatamente ao mesmo conjunto de dados na memória.
         * Se você modificar um elemento usando a referência medidasDeTemperatura (por
         * exemplo, medidasDeTemperatura[0] = 10.0;), essa mudança será refletida se
         * você acessar o mesmo elemento usando duplicata (ou seja, duplicata[0] também
         * será 10.0), e vice-versa.
         */ 

        //acessando
        //array[indice];
        System.out.println(array[23]);

        //inicializando com um for
        for(int i = 0; i < arrayDeInteiros.length; i++){
            arrayDeInteiros[i] = i + 1;
            System.out.println("Elemento:["+ i + "] = "+ arrayDeInteiros[i]);
        }

    }
}
