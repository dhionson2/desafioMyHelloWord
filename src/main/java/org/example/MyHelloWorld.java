package org.example;

import java.util.Locale;

public class MyHelloWorld {

    // Atributos
    private String firstName;
    private String lastName;
    private int age;

    // Construtor
    public MyHelloWorld(String firstName, String lastName, int age) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();
        this.age = age;
    }

    // Método para imprimir informações
    public void printInformation() {
        // Formatar e imprimir na mesma linha
        System.out.println("Nome: " + firstName.toUpperCase(Locale.ROOT) +
                ", Sobrenome: " + lastName.toUpperCase(Locale.ROOT) +
                ", Idade: " + age);
    }

    public static void main(String[] args) {
        // Criar uma instância do MyHelloWorld com informações
        MyHelloWorld myHelloWorld = new MyHelloWorld("Dhionson", "Plaster Moreira", 30);

        // Chamar o método para imprimir informações
        myHelloWorld.printInformation();
    }
}
