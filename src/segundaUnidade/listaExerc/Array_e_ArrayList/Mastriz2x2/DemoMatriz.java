package segundaUnidade.listaExerc.Array_e_ArrayList.Mastriz2x2;

public class DemoMatriz {
    public static void main(String[] args){
        Matriz2x2 matriz = new Matriz2x2(3.0f, 2.0f, 11.0f, 3.0f);
        matriz.mostrarMatriz();
        System.out.println(matriz.calcularDeterminante());
    }
}
