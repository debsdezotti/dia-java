package sistema;

import java.util.Scanner;

public class Depositar {

    private double saldo;
    private final static Scanner scanner = new Scanner(System.in);

    
    public void depositar() {
        System.out.println("Qual o valor do deposito? ");
        double deposito = scanner.nextDouble();
        System.out.println("Depositando...: ");
        saldo = this.saldo + deposito;

    }
}
