import java.util.Random;

public class Inimigo {

    private String nomeInimigo;
    private float totalVidaInimigo;
    private float finalVidaInimigo;
    private double ataqueInimigo;
    private double defesaInimigo;

    public Inimigo(String nomeInimigo) {
        this.nomeInimigo = nomeInimigo;
        totalVidaInimigo = 100f;
        finalVidaInimigo = 0f;
        Random totalAtaque = new Random();
        this.ataqueInimigo = totalAtaque.nextFloat(100f);
        Random totalDefesa = new Random();
        this.defesaInimigo = totalDefesa.nextFloat(100f);
    }

    public String getNomeInimigo() {
        return nomeInimigo;
    }

    public void setNomeInimigo(String nomeInimigo) {
        this.nomeInimigo = nomeInimigo;
    }

    public float getTotalVidaInimigo() {
        return totalVidaInimigo;
    }

    public void setTotalVidaInimigo(float totalVidaInimigo) {
        this.totalVidaInimigo = totalVidaInimigo;
    }

    public float getFinalVidaInimigo() {
        return finalVidaInimigo;
    }

    public void setFinalVidaInimigo(float finalVidaInimigo) {
        this.finalVidaInimigo = finalVidaInimigo;
    }

    public double getAtaqueInimigo() {
        return ataqueInimigo;
    }

    public void setAtaqueInimigo(double ataqueInimigo) {
        this.ataqueInimigo = ataqueInimigo;
    }

    public double getDefesaInimigo() {
        return defesaInimigo;
    }

    public void setDefesaInimigo(double defesaInimigo) {
        this.defesaInimigo = defesaInimigo;
    }

    public double totalDanoInimigo(double ataqueInimigo) {
        Random NovoAtaque = new Random();
        float newAtack = NovoAtaque.nextFloat(0.5f);
        return ataqueInimigo * newAtack;
    }

    public void receberDano(float dano) {
        this.totalVidaInimigo = Math.max(0, this.totalVidaInimigo - dano);
    }
}
