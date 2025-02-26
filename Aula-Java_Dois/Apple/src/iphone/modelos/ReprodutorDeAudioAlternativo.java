package iphone.modelos;

import java.util.Scanner;
import iphone.interfaces.ReprodutorMusic;

public class ReprodutorDeAudioAlternativo implements ReprodutorMusic {
    private String musica;
    private final static Scanner scanner = new Scanner(System.in);

    @Override
    public void escolherMusica() {
        System.out.println("Qual música quer tocar no áudio alternativo? :");
        musica = scanner.nextLine();
        System.out.println("Começar a tocar a música no áudio alternativo: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música no áudio alternativo...");
    }
}
