package com.dv.desafio;

// Esta é a classe que vai garantir que só haja uma instância de si mesma.
public class SingletonComPreguica {

    // A instância da classe é estática e privada, para que só a gente possa acessá-la.
    private static SingletonComPreguica instancia;

    // Eu fiz o construtor privado, assim ninguém de fora consegue criar uma nova instância.
    private SingletonComPreguica() {
        super();
    }

    // Este é o método que todos vão usar para pegar a única instância da classe.
    public static SingletonComPreguica getInstancia() {
        // Se a instância ainda não existe, eu a crio.
        if (instancia == null) {
            instancia = new SingletonComPreguica();
        }
        // Depois disso, eu sempre retorno a mesma instância.
        return instancia;
    }

}