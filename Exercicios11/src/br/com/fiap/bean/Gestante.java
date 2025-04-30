package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    // atributos
    private String nome;
    private LocalDate dataDaGestacao;
    // construtores
    public Gestante() {
    }
    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao);
    }
    // métodos getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }
    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        try {
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataDaGestacao, dataAtual);
            int ano = periodo.getYears();
            int meses = periodo.getMonths();
            if (ano == 0 && meses <= 9) {
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("Data inválida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0); // encerrando o programa
        }

    }
    // métodos da classe (particulares)
    public int tempoDeGestacao() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataDaGestacao, dataAtual);
        return periodo.getMonths();
    }
}
