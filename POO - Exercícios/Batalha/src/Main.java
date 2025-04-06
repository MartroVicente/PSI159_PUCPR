import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Personagem("Super-Homem"));
        personagens.add(new Personagem("Batman"));
        personagens.add(new Personagem("Homem-Aranha"));
        personagens.add(new Personagem("Capitão América"));
        personagens.add(new Personagem("Mulher-Maravilha"));
        personagens.add(new Personagem("Wolverine"));
        personagens.add(new Personagem("Thor"));

        ArrayList<Inimigo> inimigos = new ArrayList<>();

        inimigos.add(new Inimigo("Coringa"));
        inimigos.add(new Inimigo("Thanos"));
        inimigos.add(new Inimigo("Lex Luthor"));
        inimigos.add(new Inimigo("Doutor Octopus"));
        inimigos.add(new Inimigo("Magneto"));
        inimigos.add(new Inimigo("Loki"));
        inimigos.add(new Inimigo("Venom"));

        Random rand = new Random();

        Personagem personagemAleatorio = personagens.get(rand.nextInt(personagens.size()));
        Inimigo inimigoAleatorio = inimigos.get(rand.nextInt(inimigos.size()));

        Batalha batalha = new Batalha(personagemAleatorio, inimigoAleatorio);
        batalha.iniciarBatalha();
    }
}