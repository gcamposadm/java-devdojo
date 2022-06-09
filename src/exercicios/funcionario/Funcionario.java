package exercicios.funcionario;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salarios;

    public Funcionario(String nome, int idade, float[] salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprimeStatus() {
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("\nIdade: %d", this.idade);

        if (this.salarios.length == 0) {
            System.out.print("\nSalário: nenhum informado");
        } else {
            System.out.print("\nSalários: ");
            for (float salario : this.salarios) {
                System.out.printf("%.2f ", salario);
            }
            imprimeMediaSalarial();
        }
    }

    private void imprimeMediaSalarial() {
        float soma = 0;
        for (float salario : this.salarios) {
            soma = soma + salario;
        }
        float media = soma / this.salarios.length;
        System.out.printf("\nMédia salarial: %.2f", media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }
}
