package att02;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        Calculadora calculadora = new Calculadora();

        float numero;

    System.out.println("digite um numero");

    numero = ler.nextFloat();

        int resultado = calculadora.dobrar((int) numero);

        System.out.println("O dobro de " + numero + " é: " + resultado);
    }
}

