package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Astrogildo");
        funcionario1.setValorHoraTrabalho(15.75f);
        LocalDate dataAtual = LocalDate.now();

        //Neste exemplo o funcionário trabalha 20 horas por semana
        System.out.printf("Data: %d/%s/%d\nNome: %s\nSalário: R$ %.2f", dataAtual.getDayOfMonth(), dataAtual.getMonth(), dataAtual.getYear(), funcionario1.getNome(), funcionario1.calcularSalario(20.0f));
    }
}
