import java.util.Random;

public class Batalha {
    private Personagem personagem;
    private Inimigo inimigo;

    public Batalha(Personagem personagem, Inimigo inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    public void iniciarBatalha() {
        System.out.println(personagem.getNomePersonagem() + " vs " + inimigo.getNomeInimigo());
        int round = 1;

        while (personagem.getTotalVidaPersonagem() > 0 && inimigo.getTotalVidaInimigo() > 0) {
            System.out.println("\n--- Round " + round + " ---");

            // Ambos atacam no mesmo round, ordem aleatória
            if (new Random().nextBoolean()) {
                ataquePersonagem();
                if (inimigo.getTotalVidaInimigo() <= 0) break;
                ataqueInimigo();
            } else {
                ataqueInimigo();
                if (personagem.getTotalVidaPersonagem() <= 0) break;
                ataquePersonagem();
            }

            round++;

            try {
                Thread.sleep(1000); // 1000 milissegundos = 1 segundo
            } catch (InterruptedException e) {
                System.out.println("A batalha foi interrompida!");
                Thread.currentThread().interrupt(); // Restaura o estado de interrupção
                return;
            }
        }

        determinarVencedor();
    }

    private void ataquePersonagem() {
        double danoFinal = calcularDano(personagem.getAtaquePersonagem(), inimigo.getDefesaInimigo());
        inimigo.receberDano((float) danoFinal);

        System.out.println(personagem.getNomePersonagem() + " ataca! Dano: " + String.format("%.2f", danoFinal));
        System.out.println(inimigo.getNomeInimigo() + " vida: " + String.format("%.2f", inimigo.getTotalVidaInimigo()));
    }

    private void ataqueInimigo() {
        double danoFinal = calcularDano(inimigo.getAtaqueInimigo(), personagem.getDefesaPersonagem());
        personagem.receberDano((float) danoFinal);

        System.out.println(inimigo.getNomeInimigo() + " ataca! Dano: " + String.format("%.2f", danoFinal));
        System.out.println(personagem.getNomePersonagem() + " vida: " + String.format("%.2f", personagem.getTotalVidaPersonagem()));
    }

    private double calcularDano(double ataque, double defesa) {
        return Math.max(0, ataque - (defesa * 0.3));
    }

    private void determinarVencedor() {
        System.out.println("\n=== Batalha Encerrada ===");

        if (personagem.getTotalVidaPersonagem() <= 0 && inimigo.getTotalVidaInimigo() <= 0) {
            System.out.println("Empate! Ambos foram derrotados.");
        } else if (personagem.getTotalVidaPersonagem() <= 0) {
            System.out.println(inimigo.getNomeInimigo() + " venceu a batalha!");
        } else {
            System.out.println(personagem.getNomePersonagem() + " venceu a batalha!");
        }
    }
}