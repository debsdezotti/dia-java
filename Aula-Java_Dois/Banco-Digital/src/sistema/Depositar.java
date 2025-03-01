// Classe Depositar - Responsável por depósitos
package sistema;

import java.util.Scanner;

public class Depositar {
    private final static Scanner scanner = new Scanner(System.in);
    private final Conta conta;

    public Depositar(Conta conta) {
        this.conta = conta;
    }

    public void depositar() {
        System.out.println("Qual o valor do depósito? ");
        double deposito = scanner.nextDouble();
        double novoSaldo = conta.getSaldo() + deposito; // Calculamos o novo saldo
        conta.setSaldo(novoSaldo); // Atualizamos o saldo corretamente
        System.out.println("Depósito realizado! Novo saldo: R$" + conta.getSaldo());
    }
}
