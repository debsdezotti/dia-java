package sistema;

import interfacesapp.RealizarSaqueApp;

public class ConsultarSaldo implements RealizarSaqueApp {

    private double saldo;
    private double chequeespecial;

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: " + saldo);
        System.out.println("Cheque Especial: " + chequeespecial);
    }

}
