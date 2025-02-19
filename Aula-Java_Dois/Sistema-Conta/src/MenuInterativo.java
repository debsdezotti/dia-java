import java.util.Scanner;

public class MenuInterativo {


    private final static Scanner scanner = new Scanner(System.in);
    private final static Maquina Maquina = new Maquina();
    private final static AbrirConta AbrirConta = new AbrirConta();

    public static void main(String[] args) {
        int option;

        System.out.println("---- bem vinda -----");
        System.out.println("---- deposite -----");
        double deposito = scanner.nextDouble();
        AbrirConta.abraSuaConta(deposito);
        Maquina.setSaldo(AbrirConta.getSaldo());
        Maquina.setChequeEspecial(AbrirConta.getChequeEspecial());

        do {

            System.out.println("Escolha uma das opções ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Verificar Uso Cheque Especial");
            System.out.println("4 - Depositar dinheiro");
            System.out.println("5 - Sacar Dinheiro");
            System.out.println("6 - Pagar Boleto");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (option) {
                case 1:
                    Maquina.consultarSaldo();
                    break;
                case 2:
                    Maquina.consultarChequeEspecial();
                    break;
                case 3:
                    Maquina.usoCheque();
                    break;
                case 4:
                    Maquina.depositar();
                    break;
                case 5:
                    Maquina.sacarDinheiro();
                    break;
                case 6:
                    Maquina.pagarBoleto();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (option != 0);
    }



}
