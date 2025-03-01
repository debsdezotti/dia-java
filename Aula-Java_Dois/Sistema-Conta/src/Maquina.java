import java.util.Scanner;

public class Maquina {

    private double saque;
    private double saldo;
    private double chequeespecial;
    private double taxa;
    private boolean usochequeespecial = false;
    private final static Scanner scanner = new Scanner(System.in);


    public void depositar() {
        System.out.println("Qual o valor do deposito? ");
        double deposito = scanner.nextDouble();
        System.out.println("Depositando...: ");
        saldo = this.saldo + deposito;
        System.out.println("Saldo Atualizado: " + saldo);
        System.out.println("Sendo R$ " + chequeespecial + " referente a cheque especial");          
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setChequeEspecial(double chequeespecial) {
        this.chequeespecial = chequeespecial;
    }


    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: " + saldo);
        System.out.println("Cheque Especial: " + chequeespecial);
    }


    public void consultarChequeEspecial() {
        System.out.println("Seu Cheque Especial atual é de: " + chequeespecial);
    }

    public void realizarSaque(double saque, String descricao) {
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

    public void sacarDinheiro() {
        System.out.println("Qual o valor do saque? ");
        this.saque = scanner.nextDouble();
        realizarSaque(saque, "Saque");
    }

    public void pagarBoleto() {
        System.out.println("Qual o valor do boleto? ");
        this.saque = scanner.nextDouble();
        realizarSaque(saque, "pagamento");
    }
    

    public boolean getUsoCheque(){
        return usochequeespecial;
    }

    public void usoCheque() {
        if (getUsoCheque()) {
            System.out.println("Uso de Cheque Especial --> Taxa de R$" + taxa);
        }
        if (getUsoCheque() == false) {
            System.out.println("Sem uso de Cheque Especial");
        }
    }



}
