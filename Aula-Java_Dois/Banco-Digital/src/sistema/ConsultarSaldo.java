// Classe ConsultarSaldo - Responsável por consultas de saldo
package sistema;

public class ConsultarSaldo {
    private final Conta conta;

    public ConsultarSaldo(Conta conta) {
        this.conta = conta;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        System.out.println("Seu cheque especial: R$" + conta.getChequeEspecial());
    }
}
