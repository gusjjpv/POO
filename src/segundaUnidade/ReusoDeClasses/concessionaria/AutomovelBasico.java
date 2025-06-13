package segundaUnidade.ReusoDeClasses.concessionaria;

public class AutomovelBasico extends Automovel {
    private boolean radio;
    private boolean airBag;

    public AutomovelBasico(String modelo, String cor, int ano, boolean radio, boolean airBag) {
        super(modelo, cor, ano);
        this.radio = radio;
        this.airBag = airBag;
    }

    public float quantoCusta() {
        float custo = super.quantoCusta();
        if (radio)
            custo += 2000;
        if (airBag)
            custo += 15000;

        return custo;
    }

    @Override
    public String toString() {
        String res = "radio: " + (radio ? "sim" : "não") + "\n";
        res += "airBag: " + (airBag ? "sim" : "não") + "\n";
        res += "custo: " + quantoCusta() + "\n";
        return res;
    }
}
