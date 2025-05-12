package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    // atributos
    private int diaDeRendimento;
    // construtores
    public ContaPoupanca() {
    }
    // métodos getters e setters
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    // métodos da classe (particulares)
    public float novoSaldo(float rendimento) {
        float result = rendimento / 100 * super.getSaldo();
        return result + super.getSaldo();
    }
}
