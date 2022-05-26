package exercicios;

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        float salario = teclado.nextFloat();
        float valorImposto;
        String porcentagemImposto;
        if (salario > 4500) {
            porcentagemImposto = "30%";
            valorImposto = 0.3F * salario;
            System.out.printf("O imposto de %s é R$%.2f", porcentagemImposto, valorImposto);
        } else {
            porcentagemImposto = "15%";
            valorImposto = 0.15F * salario;
            System.out.printf("O imposto de %s é R$%.2f", porcentagemImposto, valorImposto);
        }
    }
}
