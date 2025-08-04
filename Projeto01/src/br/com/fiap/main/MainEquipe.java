package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class MainEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String nome;
        String[] integrantes;
        int qtde;
        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");
                qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de integrantes?"));
                integrantes = new String[qtde];
                for (int i = 0; i < integrantes.length; i++) {
                    integrantes[i] = JOptionPane.showInputDialog(String.format("Integrante %d:", i + 1));
                }
                grupo = new Equipe(nome, integrantes);
                grupo.listarEquipe();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
