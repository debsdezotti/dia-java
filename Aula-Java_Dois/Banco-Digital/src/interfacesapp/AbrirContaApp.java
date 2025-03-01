package interfacesapp;

public interface AbrirContaApp {
    void AbrirConta(double deposito);
    default void mensagemAbertura() {
        System.out.println("Parabéns! Você abriu sua conta!");
}
}
