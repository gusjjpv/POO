package segundaUnidade.listaExerc.Classes_abstratas_polimorfismo_interfaces.FiguraGeometrica;

public class DemoFiguraGeometrica {
    public static void main(String[] args){
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        circulo.descricao();
        quadrado.descricao();
        triangulo.descricao();
    }
}
