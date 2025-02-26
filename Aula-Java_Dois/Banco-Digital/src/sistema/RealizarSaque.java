package sistema;

import java.util.Scanner;
import interfacesapp.RealizarSaqueApp;

public class RealizarSaque implements RealizarSaqueApp {

    private double saque;
    private double saldo;
    private double chequeespecial;
    private double taxa;
    private boolean usochequeespecial = false;
    private final static Scanner scanner = new Scanner(System.in);

    public void sacar(double saque, String descricao) {
        System.out.println("Sacando R$" + saque + "...");
    
        // Verifica se o saldo é suficiente
        if (saldo < saque) {
            System.out.println("Saldo insuficiente. (Saldo atual: R$" + saldo + ")");
        }
        // Verifica se o saque pode ser realizado sem usar o cheque especial
        else if ((saldo - chequeespecial) > saque && saldo >= saque) {
            saldo -= saque; // Atualiza o saldo
            System.out.println("Realizando " + descricao + "...");
            System.out.println("Saldo atualizado para R$" + saldo);
        }
        // Verifica se será necessário usar o cheque especial
        else if ((saldo - chequeespecial) < saque && saldo > saque) {
            taxa = (saque - (saldo - chequeespecial)) * 0.2;
            saldo -= saque; // Atualiza o saldo
            usochequeespecial = true; // Marca que o cheque especial foi usado
            System.out.println("Realizando " + descricao + "...");
            System.out.println("Saldo atualizado para R$" + saldo);
            System.out.println("Taxa do cheque Especial R$" + taxa);
        }
    }
}
