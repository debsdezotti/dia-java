package iphone.modelos;

import iphone.interfaces.Telefone;
import java.util.Scanner;

public class AparelhoTelefonico implements Telefone {
    private int telefone;
    private final static Scanner scanner = new Scanner(System.in);

    @Override
    public void telefoneTocando() {
        System.out.println("Ring Ring...");
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void escolherTelefone() {
        System.out.println("Para quem você gostaria de telefonar?");
        telefone = scanner.nextInt();
        System.out.println("Ligando para " + telefone);
    }

    public int getTelefone() {
        return telefone;
    }
}
