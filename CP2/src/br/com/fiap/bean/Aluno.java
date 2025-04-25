package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    // atributos
    private int resgistroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;
    // construtor vazio
    public Aluno() {
    }
    // construtor com parâmetros
    public Aluno(int resgistroMatricula, String nomeCompleto, int anoDeNascimento) {
        setResgistroMatricula(resgistroMatricula);
        this.nomeCompleto = nomeCompleto;
        setAnoDeNascimento(anoDeNascimento);
    }
    // métodos getters e setters
    public int getResgistroMatricula() {
        return resgistroMatricula;
    }
    public void setResgistroMatricula(int resgistroMatricula) {
        try {
            if (resgistroMatricula >= 80000 && resgistroMatricula <= 599999){
                this.resgistroMatricula = resgistroMatricula;
            } else {
                throw new Exception("Número de matrícula inválido!(min=80000 até max=599999)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }
    public void setAnoDeNascimento(int anoDeNascimento) {
        int anoAtual = LocalDate.now().getYear();
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= anoAtual) {
                this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new Exception("Ano de nascimento inválido! (min=1945 até max=Ano Atual)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // métodos de classe (particulares)
    public int calcularIdade (LocalDate dataAtual) {
        return dataAtual.getYear() - anoDeNascimento;

    }

}


