// Classe AbrirConta - Responsável pela criação da conta
package sistema;

import interfacesapp.AbrirContaApp;

public class AbrirConta extends Conta implements AbrirContaApp {

    public AbrirConta(double depositoInicial) {
        super(depositoInicial); // Chama o construtor da classe Conta
        System.out.println("Sua conta foi aberta com sucesso!");
    }

    @Override
    public void abraSuaConta(double deposito) {
        // Neste caso, o construtor já inicializa tudo, então podemos apenas exibir os dados
        System.out.println("Conta já aberta com saldo: R$" + getSaldo());
    }

    // Método para atualizar o saldo
    public void atualizarSaldo(double novoSaldo) {
        setSaldo(novoSaldo);
    }
}
