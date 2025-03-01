// Classe principal - AppBanco
package aplicativo;

import java.util.Scanner;
import sistema.AbrirConta;
import sistema.Conta;
import sistema.Depositar;
import sistema.Saque;

public class AppBanco {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---- Bem-vinde! -----");
        System.out.println("---- Faça seu primeiro depósito -----");
        double depositoInicial = scanner.nextDouble();

        // Criamos a conta
        AbrirConta abertura = new AbrirConta();
        Conta conta = abertura.abrirConta(depositoInicial);

        // Criamos serviços para saque e depósito
        Saque saque = new Saque(conta);
        Depositar depositar = new Depositar(conta);

        int option;
        do {
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (option) {
                case 1 -> saque.consultarSaldoAtual();
                case 2 -> {
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    saque.sacar(valorSaque, "saque");
                }
                case 3 -> depositar.depositar();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (option != 0);

        scanner.close();
    }
}
