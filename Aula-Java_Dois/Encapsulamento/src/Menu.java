import java.util.Scanner;

public class Menu {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se há pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Lavar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (option) {
                case 1:
                    petMachine.takeAShower();
                    break;
                case 2:
                    setWater();
                    break;
                case 3:
                    setShampoo();
                    break;
                case 4:
                    verifyWater();
                    break;
                case 5:
                    verifyShampoo();
                    break;
                case 6:
                    checkIfHasPetInMachine();
                    break;
                case 7:
                    setPetInMachine();
                    break;
                case 8:
                    petMachine.removePet();
                    break;
                case 9:
                    petMachine.wash();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (option != 0);
    }

    private static void setShampoo() {
        System.out.println("Colocando shampoo na máquina...");
        petMachine.addShampoo();
    }

    private static void setWater() {
        System.out.println("Colocando água na máquina...");
        petMachine.addWater();
    }

    private static void verifyWater() {
        int amount = petMachine.getWater();
        System.out.println("A máquina está com " + amount + " de água.");
    }

    private static void verifyShampoo() {
        int amount = petMachine.getShampoo();
        System.out.println("A máquina está com " + amount + " de shampoo.");
    }

    private static void checkIfHasPetInMachine() {
        boolean hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void setPetInMachine() {
        String name = "";
        while (name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.nextLine();
        }

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }
}

