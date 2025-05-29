package primeiraUnidade.listaExerc.classPartDois.NumeroComplexo;

public class NumeroComplexo {
    double real, imaginario;

    NumeroComplexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    NumeroComplexo(double real) {
        this.real = real;
        this.imaginario = 0.0;
    }

    NumeroComplexo() {
        this.real = 0.0;
        this.imaginario = 0.0;
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginario);
    }

    
}
