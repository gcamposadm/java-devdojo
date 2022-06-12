package exercicios.imposto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        CalculoImpostoDeRenda2022 salario1 = new CalculoImpostoDeRenda2022(teclado.nextFloat());
        salario1.calcularImpostoDeRenda();
    }

}
