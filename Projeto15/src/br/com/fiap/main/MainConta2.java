package br.com.fiap.main;

import br.com.fiap.bean.ContaEspecial;

import javax.swing.*;

public class MainConta2 {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int numConta, opcao;
        float saldo, valor, limite;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Digite número da conta");
                numConta = Integer.parseInt(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Digite saldo da conta");
                saldo = Float.parseFloat(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Digite limite da conta");
                limite = Float.parseFloat(auxiliar);
                ContaEspecial ce = new ContaEspecial();
                ce.setNumConta(numConta);
                ce.setSaldo(saldo);
                ce.setLimite(limite);
                auxiliar = JOptionPane.showInputDialog("Escolha operação:\n(1) Saque \n(2) Depósito");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para sacar");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta: \nNúmero da conta: %d \nSaldo atual: %.2f", ce.getNumConta(), ce.sacar(valor)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para depósito");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta: \nNúmero da conta: %d \nSaldo atual: %.2f", ce.getNumConta(), ce.depositar(valor)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            escolha = JOptionPane.showInputDialog("Deseja continuar?");
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}
