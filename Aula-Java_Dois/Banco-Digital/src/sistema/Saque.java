// Classe Saque - Responsável por saques
package sistema;

import interfacesapp.RealizarSaqueApp;

public class Saque implements RealizarSaqueApp {
    private final Conta conta; // Agora acessamos diretamente a conta

    public Saque(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void sacar(double saque, String descricao) {
        System.out.println("Sacando R$" + saque + "...");

        double saldoAtual = conta.getSaldo();
        double chequeEspecial = conta.getChequeEspecial();

        if (saldoAtual < saque) {
            System.out.println("Saldo insuficiente. (Saldo atual: R$" + saldoAtual + ")");
        } else if ((saldoAtual - chequeEspecial) > saque) {
            saldoAtual -= saque;
            conta.setSaldo(saldoAtual);
            System.out.println("Realizando " + descricao + "...");
            System.out.println("Saldo atualizado para R$" + saldoAtual);
        } else {
            double taxa = (saque - (saldoAtual - chequeEspecial)) * 0.2;
            saldoAtual -= saque;
            conta.setSaldo(saldoAtual);
            conta.setTaxa(taxa);
            System.out.println("Realizando " + descricao + "...");
            System.out.println("Saldo atualizado para R$" + saldoAtual);
            System.out.println("Taxa do cheque especial: R$" + taxa);
        }
    }

    @Override
    public void consultarSaldoAtual() {
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
