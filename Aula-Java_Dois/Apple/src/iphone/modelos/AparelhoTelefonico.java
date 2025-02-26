package iphone.modelos;

import java.util.Scanner;
import iphone.interfaces.Telefone;

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
    public int escolherTelefone() {
        System.out.println("Para quem você gostaria de telefonar?");
        telefone = scanner.nextInt();
        System.out.println("Ligando para " + telefone);
        return telefone;
    }

    public int getTelefone() {
        return telefone;
    }
}
