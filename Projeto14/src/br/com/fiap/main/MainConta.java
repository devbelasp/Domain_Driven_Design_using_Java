package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;

public class MainConta {
    public static void main(String[] args) {
        String auxiliar, cliente, escolha = "sim";
        float saldo, limite;
        int numConta, diaDeRendimento, opcao;
        LocalDate diaAtual = LocalDate.now();
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual o tipo da conta? \n(1) Conta Bancária \n(2) Conta Poupança \n(3) Conta Especial");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        cliente
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa. Volte sempre.");
    }
}
