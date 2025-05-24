package primeiraUnidade.classes.data;

public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    private boolean dataEhValida(){
        return (dia>0 && dia <=30 && mes>0 && mes<=12 && ano>=0);
    }

    public void inicializaData(int d, int m, int a){
        
        dia = d;
        mes = m;
        ano = a;
        if (!this.dataEhValida()){
            dia = 1;
            mes = 1;
            ano = 200;
        }
    }

    public void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}