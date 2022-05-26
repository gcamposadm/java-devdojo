package exercicios;

import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um nome de usuário: ");
        String nomeDeUsuario = input.next();

        if (nomeDeUsuario.isEmpty() ||
                nomeDeUsuario.isBlank() ||
                nomeDeUsuario.equalsIgnoreCase("admin") ||
                nomeDeUsuario.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        } else
            System.out.printf("%s cadastrado com sucesso", nomeDeUsuario);
    }
}
