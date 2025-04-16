import br.com.imjb777.music.Musica;
import br.com.imjb777.music.Podcast;
import br.com.imjb777.music.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Tu es");
        musica1.setArtista("Fhop music");

        //mumero aleario no for em forma de aprendizado

        for (int i = 0; i < 30; i++) {
            musica1.reproducao();
        }
        for (int i = 0; i < 15; i++) {
            musica1.curte();
        }
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("estagiario");
        podcast1.setHost("JB");

        for (int i = 0; i < 30; i++) {
            podcast1.reproducao();
        }

        for (int i = 0; i < 15; i++) {
            podcast1.curte();

        }
        Preferidas preferidas1 = new Preferidas();
        preferidas1.incluir(podcast1);
        preferidas1.incluir(musica1);
    }
}