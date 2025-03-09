package strategy;

import Strategy.Comportamento;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Atacando!");
}
