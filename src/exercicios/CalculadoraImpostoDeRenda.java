package exercicios;

import java.util.Scanner;

public class CalculadoraImpostoDeRenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        float salario = teclado.nextFloat();
        float aliquota;
        float parcelaDeduzir;
        float impostoDeRenda;
        float tetoIsencao = 1903.98F;
        float faixaUmLimiteInferior = 1903.99F;
        float faixaUmLimiteSuperior = 2826.65F;
        float faixaDoisLimiteInferior = 2826.66F;
        float faixaDoisLimiteSuperior = 3751.05F;
        float faixaTresLimiteInferior = 3751.06F;
        float faixaTresLimiteSuperior = 4664.68F;
        if (salario <= tetoIsencao) {
            System.out.println("Você está isento do Imposto de Renda!!!");
        } else if (salario >= faixaUmLimiteInferior && salario <= faixaUmLimiteSuperior) {
            aliquota = 0.075F;
            parcelaDeduzir = 142.80F;
            impostoDeRenda = (salario * aliquota) - parcelaDeduzir;
            System.out.printf("Seu imposto é de R$%.2f", impostoDeRenda);
        } else if (salario >= faixaDoisLimiteInferior && salario <= faixaDoisLimiteSuperior) {
            aliquota = 0.15F;
            parcelaDeduzir = 354.80F;
            impostoDeRenda = (salario * aliquota) - parcelaDeduzir;
            System.out.printf("Seu imposto é de R$%.2f", impostoDeRenda);
        } else if (salario >= faixaTresLimiteInferior && salario <= faixaTresLimiteSuperior) {
            aliquota = 0.225F;
            parcelaDeduzir = 636.13F;
            impostoDeRenda = (salario * aliquota) - parcelaDeduzir;
            System.out.printf("Seu imposto é de R$%.2f", impostoDeRenda);
        } else {
            aliquota = 0.275F;
            parcelaDeduzir = 869.36F;
            impostoDeRenda = (salario * aliquota) - parcelaDeduzir;
            System.out.printf("Seu imposto é de R$%.2f", impostoDeRenda);
        }
    }
}
