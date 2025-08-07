package com.dv.desafio;

public class Robo {

    // O Robo tem um atributo do tipo da interface.
    // Isso é o que permite a flexibilidade do padrão Strategy.
    private Comportamento comportamento;

    // Método para definir o comportamento do Robo.
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    // O Robo apenas delega o trabalho para o seu objeto de comportamento.
    public void mover() {
        comportamento.mover();
    }
}
