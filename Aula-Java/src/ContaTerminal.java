
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação das informações ao usuário
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine(); // Recebe o número da agência

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = scanner.nextInt(); // Recebe o número da conta
        scanner.nextLine(); // Consumir o caractere de nova linha restante

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine(); // Recebe o nome do cliente

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble(); // Recebe o saldo da conta

        // Exibe a mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
