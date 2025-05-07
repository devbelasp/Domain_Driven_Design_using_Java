package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario {
    // atributos
    private float adicionalNoturno;
    // construtores
    public VigiaNoturno() {
    }
    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        super(nome, valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }
    // métodos getters e setters
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    // métodos da classe (particulares)
    public float calcularSalario() {
        return super.calcularSalario() + getAdicionalNoturno();
    }
}
