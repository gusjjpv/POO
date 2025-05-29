package segundaUnidade.ArraysEArrayLists.piSobreSeis;

public class PiSobreSeis {
    public static void main(String[] args){
        double termosDaSerie[] = new double[1000000];
        for (int i = 0; i <termosDaSerie.length; i++){
            termosDaSerie[i] = 1/(Math.pow(i+1, 2));
        }

        for(int num = 10; num <= 1000000; num*=10){
            calculaEMostraSomatoria(termosDaSerie, num);
        }
        
    }

    public static void calculaEMostraSomatoria(double array[], int num){
        double soma = 0.0;
        for (int i = 0; i < num; i++){
            soma += array[i];
        }
        System.out.println("A soma dos primeiros elementos eh " + soma);
    }
}
