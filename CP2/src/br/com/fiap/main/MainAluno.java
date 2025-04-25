package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        // construtor sem parâmetro
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        // construtor com parâmetro
        Aluno aluno3;
        Aluno aluno4;

        // Aluno 1
       aluno1.setNomeCompleto("Isabela dos Santos Pinto");
       aluno1.setResgistroMatricula(563422);
       aluno1.setAnoDeNascimento(1998);
       // Aluno 2
        aluno2.setNomeCompleto("Manuela de Lacerda");
        aluno2.setResgistroMatricula(563423);
        aluno2.setAnoDeNascimento(2002);

        LocalDate dataAtual = LocalDate.now();
        String auxiliar;


        try {
            // Aluno 3
            aluno3 = new Aluno();
            aluno3.setNomeCompleto(JOptionPane.showInputDialog("Digite seu nome completo"));
            auxiliar = JOptionPane.showInputDialog("Digite seu número de matrícula");
            aluno3.setResgistroMatricula(Integer.parseInt(auxiliar));
            auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento");
            aluno3.setAnoDeNascimento(Integer.parseInt(auxiliar));

            // Aluno 4
            aluno4 = new Aluno();
            aluno4.setNomeCompleto(JOptionPane.showInputDialog("Digite seu nome completo"));
            auxiliar = JOptionPane.showInputDialog("Digite seu número de matrícula");
            aluno4.setResgistroMatricula(Integer.parseInt(auxiliar));
            auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento");
            aluno4.setAnoDeNascimento(Integer.parseInt(auxiliar));

            // Exibindo mensagem
            String mensagem = String.format("Informações dos 4 integrantes do grupo \nRM: %d \nAluno(a): %s \nIdade: %d \nRM: %d \nAluno(a): %s \nIdade: %d \nRM: %d \nAluno(a): %s \nIdade: %d \nRM: %d \nAluno(a): %s \nIdade: %d", aluno1.getResgistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual.getYear()), aluno2.getResgistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual.getYear()), aluno3.getResgistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual.getYear()), aluno4.getResgistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual.getYear()));
            JOptionPane.showMessageDialog(null,mensagem);

        } catch (Exception e) {
            System.out.println("Nome, matrícula ou ano de nascimento inválido(s)");
        }
    }
}
