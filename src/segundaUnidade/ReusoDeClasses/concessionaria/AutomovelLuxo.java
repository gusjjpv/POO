package segundaUnidade.ReusoDeClasses.concessionaria;

public class AutomovelLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelLuxo(String modelo, String cor, int ano, boolean radio, boolean airBag, boolean arCondicionado, boolean direcaoHidraulica) {
        super(modelo, cor, ano, radio, airBag);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public float quantoCusta() {
        float custo = super.quantoCusta();
        if (arCondicionado)
            custo += 10000;
        if (direcaoHidraulica)
            custo += 5000;

        return custo;
    }

    @Override
    public String toString() {
        String res = "arcondicionado: " + (arCondicionado ? "sim" : "não") + "\n";
        res += "direcaoHidraulica: " + (direcaoHidraulica ? "sim" : "não") + "\n";
        res += "custo: " + quantoCusta() + "\n";
        return res;
    }
}
