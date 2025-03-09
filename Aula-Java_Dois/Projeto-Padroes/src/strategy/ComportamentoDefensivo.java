package strategy;

import Strategy.Comportamento;

public class ComportamentoDefesivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
}
