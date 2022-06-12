package exercicios.imposto;

public class CalculoImpostoDeRenda2022 {
    private float salario;

    private static final float tetoIsencao = 1903.98F;
    private static final float faixaUmLimiteInferior = 1903.99F, faixaUmLimiteSuperior = 2826.65F;
    private static final float faixaDoisLimiteInferior = 2826.66F, faixaDoisLimiteSuperior = 3751.05F;
    private static final float faixaTresLimiteInferior = 3751.06F, faixaTresLimiteSuperior = 4664.68F;

    public CalculoImpostoDeRenda2022(float salario) {
        this.salario = salario;
    }

    public void calcularImpostoDeRenda() {
        float aliquota, parcelaDeduzir, impostoDeRenda;

        imprime();

        if (this.salario <= tetoIsencao) {
            System.out.println("\nVocê está isento do Imposto de Renda!!!");
        } else if (this.salario >= faixaUmLimiteInferior && this.salario <= faixaUmLimiteSuperior) {
            aliquota = 0.075F;
            parcelaDeduzir = 142.80F;
            impostoDeRenda = (this.salario * aliquota) - parcelaDeduzir;
            System.out.printf("\nImposto de Renda: R$%.2f", impostoDeRenda);
        } else if (this.salario >= faixaDoisLimiteInferior && this.salario <= faixaDoisLimiteSuperior) {
            aliquota = 0.15F;
            parcelaDeduzir = 354.80F;
            impostoDeRenda = (this.salario * aliquota) - parcelaDeduzir;
            System.out.printf("\nImposto de Renda: R$%.2f", impostoDeRenda);
        } else if (this.salario >= faixaTresLimiteInferior && this.salario <= faixaTresLimiteSuperior) {
            aliquota = 0.225F;
            parcelaDeduzir = 636.13F;
            impostoDeRenda = (this.salario * aliquota) - parcelaDeduzir;
            System.out.printf("\nImposto de Renda: R$%.2f", impostoDeRenda);
        } else {
            aliquota = 0.275F;
            parcelaDeduzir = 869.36F;
            impostoDeRenda = (this.salario * aliquota) - parcelaDeduzir;
            System.out.printf("\nImposto de Renda: R$%.2f", impostoDeRenda);
        }
    }

    public void imprime() {
        System.out.printf("\nSalário: %.2f", this.salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
