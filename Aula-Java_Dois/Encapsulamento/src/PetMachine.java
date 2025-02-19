public class PetMachine {
    
    private Boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet para iniciar o banho");
            return;
        }
        if (water < 10 || shampoo < 2) {
            System.out.println("Não há recursos suficientes para dar banho no pet.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    } 

    public void addWater() {
        if (water >= 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water = Math.min(30, water + 2);
    }

    public void addShampoo() {
        if (shampoo >= 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo = Math.min(10, shampoo + 2);
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja. Para colocar o pet, é necessário limpá-la.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover.");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("O Pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }

    public void wash() {
        if (water < 10) {
            System.out.println("Não há água suficiente para lavar a máquina.");
            return;
        }
        if (shampoo < 2) {
            System.out.println("Não há shampoo suficiente para lavar a máquina.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa.");
    }
}
