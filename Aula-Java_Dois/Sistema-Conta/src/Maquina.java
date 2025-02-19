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
        System.out.println("Cheque especial: " + chequeespecial);
    }


    public void consultarChequeEspecial() {
        System.out.println("Seu Cheque Especial atual é de: " + chequeespecial);
    }

    public void sacarDinheiro() {
        System.out.println("Qual o valor do saque? ");
        double saque = scanner.nextDouble();
        System.out.println("Sacando R$" + saque + "...");
        // não realizará o saque
        if (saldo < saque) {
            System.out.println("Saldo insuficiente. (Saldo atual: R$" + saldo + ")");
        }
        // não usará limite
        if ((saldo - chequeespecial) > saque) {
            saldo = this.saldo - saque;
            System.out.println("Realizando saldo...");
            System.out.println("Saldo atualizado para R$" + saldo);
        }
        // usará limite
        if ((saldo - chequeespecial) < saque && saldo > saque ) {
            taxa = (saque - (saldo - chequeespecial))*0.2;
            saldo = this.saldo - saque;
            System.out.println("Realizando saldo...");
            System.out.println("Saldo atualizado para R$" + saldo);
            System.out.println("Taxa do cheque especial R$" + taxa);
            this.usochequeespecial = true;
        }

    }

    public boolean getUsoCheque(){
        return usochequeespecial;
    }

    public void usoCheque() {
        if (getUsoCheque()) {
            System.out.println("Uso de cheque especial --> Taxa de R$" + taxa);
        }
        if (getUsoCheque() == false) {
            System.out.println("Sem uso de cheque especial");
        }
    }

    public void pagarBoleto() {
        System.out.println("Qual o valor do boleto? ");
        double saque = scanner.nextDouble();
        System.out.println("Sacando R$" + saque + "...");
        // não realizará o saque
        if (saldo < saque) {
            System.out.println("Saldo insuficiente. (Saldo atual: R$" + saldo + ")");
        }
        // não usará limite
        if ((saldo - chequeespecial) > saque) {
            saldo = this.saldo - saque;
            System.out.println("Pagando Boleto...");
            System.out.println("Saldo atualizado para R$" + saldo);
        }
        // usará limite
        if ((saldo - chequeespecial) < saque && saldo > saque ) {
            taxa = (saque - (saldo - chequeespecial))*0.2;
            saldo = this.saldo - saque;
            System.out.println("Pagando Boleto...");
            System.out.println("Saldo atualizado para R$" + saldo);
            System.out.println("Taxa do cheque especial de R$" + taxa);
            this.usochequeespecial = true;
        }
        
    }

}
