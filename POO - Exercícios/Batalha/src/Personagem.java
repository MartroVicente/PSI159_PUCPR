import java.util.Random;

public class Personagem {

    private String nomePersonagem;
    private float totalVidaPersonagem;
    private float finalVidaPersonagem;
    private double ataquePersonagem;
    private double defesaPersonagem;

    public Personagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
        totalVidaPersonagem = 100f;
        finalVidaPersonagem = 0f;
        Random totalAtaquePersonagem = new Random();
        this.ataquePersonagem = totalAtaquePersonagem.nextFloat(100f);
        Random totalDefesaPersonagem = new Random();
        this.defesaPersonagem = totalDefesaPersonagem.nextFloat(100f);
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public float getTotalVidaPersonagem() {
        return totalVidaPersonagem;
    }

    public void setTotalVidaPersonagem(float totalVidaPersonagem) {
        this.totalVidaPersonagem = totalVidaPersonagem;
    }

    public float getFinalVidaPersonagem() {
        return finalVidaPersonagem;
    }

    public void setFinalVidaPersonagem(float finalVidaPersonagem) {
        this.finalVidaPersonagem = finalVidaPersonagem;
    }

    public double getAtaquePersonagem() {
        return ataquePersonagem;
    }

    public void setAtaquePersonagem(double ataquePersonagem) {
        this.ataquePersonagem = ataquePersonagem;
    }

    public double getDefesaPersonagem() {
        return defesaPersonagem;
    }

    public void setDefesaPersonagem(double defesaPersonagem) {
        this.defesaPersonagem = defesaPersonagem;
    }

    public double totalDanoPersonagem(double ataquePersonagem) {
        Random NovoAtaque = new Random();
        float newAtack = NovoAtaque.nextFloat(0.5f);
        return ataquePersonagem * newAtack;
    }

    public void receberDano(float dano) {
        this.totalVidaPersonagem = Math.max(0, this.totalVidaPersonagem - dano);
    }
}