package iphone.modelos;

import java.util.Scanner;
import iphone.interfaces.ReprodutorMusic;

public class ReprodutorMusical implements ReprodutorMusic {
    private String musica;
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void escolherMusica() {
        System.out.print("Qual música quer escutar? ");
        musica = scanner.nextLine();
        System.out.println("Começando a tocar a música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música...");
    }
}
