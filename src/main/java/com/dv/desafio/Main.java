package com.dv.desafio;

public class Main {

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {

        // --- Testando o Singleton ---
        System.out.println(GREEN + BOLD + "--- Testando Padrão Singleton ---" + RESET);
        SingletonComPreguica instancia1 = SingletonComPreguica.getInstancia();
        System.out.println("Instancia 1: " + instancia1);

        SingletonComPreguica instancia2 = SingletonComPreguica.getInstancia();
        System.out.println("Instancia 2: " + instancia2);
        System.out.println("As instâncias são a mesma? " + (instancia1 == instancia2) + "\n");

        System.out.println(CYAN + "---------------------------------" + RESET);

        // --- Testando o Strategy ---
        System.out.println(GREEN + BOLD + "--- Testando Padrão Strategy ---" + RESET);

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        System.out.println();

        System.out.println(CYAN + "---------------------------------" + RESET);

        // --- Testando o Facade ---
        System.out.println(GREEN + BOLD + "--- Testando Padrão Facade ---" + RESET);
        Facade fachada = new Facade();
        fachada.migrarCliente("José da Silva", "14800-000");
        System.out.println();

        System.out.println(CYAN + "---------------------------------" + RESET);
    }
}