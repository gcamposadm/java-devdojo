package exercicios;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do participante: ");
        String nome = teclado.next();
        System.out.println("Digite a idade do participante: ");
        int idade = teclado.nextInt();
        if (idade <= 10) {
            System.out.printf("%s participará da categoria Infantil", nome);
        } else if (idade <= 15) {
            System.out.printf("%s participará da categoria Juvenil", nome);
        } else if (idade <= 19) {
            System.out.printf("%s participará da categoria Pré-adulto", nome);
        } else {
            System.out.printf("%s participará da categoria Adulto", nome);
        }
    }
}
