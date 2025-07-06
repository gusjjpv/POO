package segundaUnidade.listaExerc.Array_e_ArrayList.Dados;

public class DemoDado {
    public static void main(String[] args){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int somas[] = new int[11];
        int valor;

        for(int i = 0; i < 36000000;i++){
            valor = dado1.lancar() + dado2.lancar();
            somas[valor-2] += 1;
        }

        for(int i = 0; i < somas.length; i++){
            System.out.println("somas de " + (i + 2) + ": " + somas[i]);
        }
    }
}
