package interfacesapp;

import sistema.Conta;

public interface AbrirContaApp {
    Conta abrirConta(double deposito);

    default void mensagemAbertura() {
        System.out.println("Parabéns! Você abriu sua conta!");
    }
}
