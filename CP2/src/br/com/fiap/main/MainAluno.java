package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;

import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        // construtor com parâmetros
        Aluno aluno1 = new Aluno(563422, "Isabela dos Santos Pinto", 1998);
        Aluno aluno2 = new Aluno(563423, "Manuela de Lacerda Soares", 2003);
        // construtor sem parâmetros
        Aluno aluno3;
        Aluno aluno4;

        LocalDate dataAtual = LocalDate.now(); // variável local (data atual)

        try {
            aluno3 = new Aluno();  // Instânciando objeto aluno3
            // InputDialog - dados do aluno 3 fornecidos pelo usuário
            aluno3.setResgistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do aluno 3:")));
            aluno3.setNomeCompleto(JOptionPane.showInputDialog("Digite o nome completo do aluno 3:"));
            aluno3.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do aluno 3:")));

            aluno4 = new Aluno(); // Instânciando objeto aluno4
            // InputDialog - dados do aluno 4 fornecidos pelo usuário
            aluno4.setResgistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do aluno 4:")));
            aluno4.setNomeCompleto(JOptionPane.showInputDialog("Digite o nome completo do aluno 4:"));
            aluno4.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do aluno 4:")));

            // Exibindo mensagem incluindo as informações dos 4 alunos
            String mensagem = String.format("Informações dos 4 integrantes do grupo: \nRM: %d | Aluno(a): %s | Idade: %d \nRM: %d | Aluno(a): %s | Idade: %d \nRM: %d | Aluno(a): %s | Idade: %d \nRM: %d | Aluno(a): %s | Idade: %d", aluno1.getResgistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual), aluno2.getResgistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual), aluno3.getResgistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual), aluno4.getResgistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual));

            JOptionPane.showMessageDialog(null,mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Nome, matrícula ou ano de nascimento inválido(s)");
        }
    }
}
