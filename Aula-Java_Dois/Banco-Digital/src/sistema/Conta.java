package sistema;

public class Conta {
    private double saldo;
    private final double chequeEspecial;
    private double taxa;
    
    // Construtor para inicializar a conta
    protected  Conta(double saldoInicial) {
        this.chequeEspecial = saldoInicial <= 500.0 ? 50.0 : saldoInicial * 0.5;
        this.saldo = saldoInicial + chequeEspecial;
        System.out.println("Seu saldo inicial: R$" + saldo);
        System.out.println("Seu cheque especial: R$" + chequeEspecial);
    }

    // Métodos Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
