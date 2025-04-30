package br.com.fiap.bean;

public class Funcionario {
    private String nome;
    private float valorHoraTrabalho;
    public Funcionario() {
    }
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        //this.valorHoraTrabalho = valorHoraTrabalho;
        setValorHoraTrabalho(valorHoraTrabalho);
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        try {
            if (valorHoraTrabalho > 0) {
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                throw new Exception("Valor não pode ser menos ou igual a zero!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float calcularSalario(float qtdeHorasTrabalhadaSemana) {
        return valorHoraTrabalho * qtdeHorasTrabalhadaSemana * 4;
    }
}
