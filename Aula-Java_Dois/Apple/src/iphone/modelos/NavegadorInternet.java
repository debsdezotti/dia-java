package iphone.modelos;

import java.util.Scanner;
import iphone.interfaces.Navegador;

public class NavegadorInternet implements Navegador {
    
    private String site;
    private final static Scanner scanner = new Scanner(System.in);

    @Override
    public void escolherSite() {
        System.out.println("Qual site quer navegar?");
        site = scanner.nextLine();
        System.out.println("Abrindo aba do site: " + site);
    }

    @Override
    public void atualizarSite() {
        System.out.println("Atualizando o site: " + site);
    }

    public String getSite() {
        return site;
    }
}
