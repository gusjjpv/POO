package segundaUnidade.listaExerc.Array_e_ArrayList.Mastriz2x2;
public class Matriz2x2{
    private float matriz[][] = new  float[2][2];

    public Matriz2x2(float v00, float v01, float v11, float v10){
        this.matriz[0][0] = v00;
        this.matriz[0][1] = v01;
        this.matriz[1][0] = v10;
        this.matriz[1][1] = v11;

    }

    public void mostrarMatriz(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public float calcularDeterminante(){
        return (this.matriz[0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]);
    }

    
}