package exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        int restoDivisao = numero % 2;
        if (restoDivisao == 0) {
            System.out.printf("O número %d é par", numero);
        } else {
            System.out.printf("O número %d é ímpar", numero);
        }
    }
}
