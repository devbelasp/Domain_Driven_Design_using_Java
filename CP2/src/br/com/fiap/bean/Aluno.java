package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    // atributos
    private int resgistroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;
    // construtores
    public Aluno() {
    }
    public Aluno(int resgistroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.resgistroMatricula = resgistroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
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
        LocalDate dataAtual = LocalDate.now();
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()) {
                this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new Exception("Valor inválido! (min=1945 até max=Ano Atual)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // métodos de classe (particulares)
    public int calcularIdade (int anoAtual) {
        return anoAtual - anoDeNascimento;
    }

}


