package model;

import java.util.Scanner;

public class Calculadora {

    Scanner entradaDados = new Scanner(System.in);

    private String teclado = entradaDados.nextLine();

    public Calculadora(String teclado) {
        this.teclado = teclado;
    }

    public double adicao() {
        return 0.0;
    }

    public double subtracao() {
        return 0.0;
    }

    public double multiplicacao() {
        return 0.0;
    }

    public double divisao() {
        return 0.0;
    }
}
