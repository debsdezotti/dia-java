package iphone.app;

import java.util.Scanner;

import iphone.modelos.AparelhoTelefonico;
import iphone.modelos.NavegadorInternet;
import iphone.modelos.ReprodutorMusical;

public class Iphone {

    private final static Scanner scanner = new Scanner(System.in);
    private final static ReprodutorMusical musicPlayer = new ReprodutorMusical();
    private final static NavegadorInternet navegador = new NavegadorInternet();
    private final static AparelhoTelefonico telefone = new AparelhoTelefonico();

    public static void main(String[] args) throws Exception {
        
        int option;

        do {
            System.out.println("Escolha uma das opções ===");
            System.out.println("1 - Escolher Música");
            System.out.println("2 - Pausar Música");
            System.out.println("3 - Escolher Site");
            System.out.println("4 - Nova Aba");
            System.out.println("5 - Atualizar Site");
            System.out.println("6 - Telefonar");
            System.out.println("7 - Atender Telefone");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (option) {
                case 1 -> musicPlayer.escolherMusica();
                case 2 -> musicPlayer.pausarMusica();
                case 3 -> navegador.escolherSite();
                case 4 -> {
                    // Implementar lógica para abrir uma nova aba, se necessário
                    System.out.println("Nova aba aberta.");
                }
                case 5 -> navegador.atualizarSite();
                case 6 -> telefone.escolherTelefone();
                case 7 -> telefone.atenderTelefone();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        } while (option != 0);
    }
}
