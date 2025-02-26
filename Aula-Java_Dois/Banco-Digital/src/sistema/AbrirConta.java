package sistema;

import interfacesapp.AbrirContaApp;

public class AbrirConta implements AbrirContaApp {
    private double deposito;
    private double saldo;
    private double chequeespecial;

    public void abraSuaConta(double deposito) {
        this.deposito = deposito;
        if (this.deposito <= 500.0) {
            System.out.println("Seu primeiro deposito foi de: R$" + deposito);
            this.chequeespecial = 50.0;
            System.out.println("Seu cheque especial é de: R$" + chequeespecial);
            saldo = deposito + chequeespecial;
            System.out.println("O saldo total é de: R$" + saldo);
        }
        if (this.deposito > 500.0) {
            System.out.println("Seu primeiro deposito foi de: R$" + deposito);
            this.chequeespecial = deposito*0.5;
            System.out.println("Seu cheque espevial é de: R$" + chequeespecial);
            saldo = deposito + chequeespecial;
            System.out.println("O saldo total é de: R$" + saldo);
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public double getChequeEspecial(){
        return chequeespecial;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}

