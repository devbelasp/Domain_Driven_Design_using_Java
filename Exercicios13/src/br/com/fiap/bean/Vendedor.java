package br.com.fiap.bean;

public class Vendedor extends Funcionario {
    // atributos
    private float comissao;
    // construtores
    public Vendedor() {
    }
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        super(nome, valorHoraTrabalho);
        this.comissao = comissao;
    }
    // métodos getters e setters
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    // métodos da classe (particulares)
    public float calcularSalario() {
        return super.calcularSalario() * (1 + getComissao()/100);
    }
}
