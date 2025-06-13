package segundaUnidade.listaExerc.Array_e_ArrayList.Dados;

public class DemoDado {
    public static void main(String[] args){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int frequenciaSomas[] = new int[13];

        for(int i = 0; i < 36000000; i++){
            int valorDados1 = dado1.jogarDado();
            int valorDados2 = dado2.jogarDado();
            
            int soma = valorDados1 + valorDados2;

            frequenciaSomas[soma]++;
        }

        for(int soma = 2; soma < frequenciaSomas.length; soma++){
            System.out.printf("%d\t%d%n", soma, frequenciaSomas[soma]);
        }
    }
}
