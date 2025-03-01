// Classe AbrirConta - Responsável pela criação da conta
package sistema;

import interfacesapp.AbrirContaApp;

public class AbrirConta implements AbrirContaApp {

    @Override
    public Conta abrirConta(double depositoInicial) {
        Conta novaConta = new Conta(depositoInicial);
        System.out.println("Sua conta foi aberta com sucesso!");
        return novaConta;
    }
}
