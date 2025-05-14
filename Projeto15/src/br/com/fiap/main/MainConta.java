package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;

public class MainConta {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int numConta, opcao;
        float valor, saldo;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Digite o número da conta");
                numConta = Integer.parseInt(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Digite o saldo da conta");
                saldo = Float.parseFloat(auxiliar);
                ContaPoupanca cp = new ContaPoupanca();
                cp.setNumConta(numConta);
                cp.setSaldo(saldo);
                auxiliar = JOptionPane.showInputDialog("Escolha a operação \n(1) Saque \n(2) Depósito");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para saque");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta \nNúmero da Conta: %d \nSaldo Atual: R$ %.2f", cp.getNumConta(), cp.sacar(valor)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor para depósito");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da Conta \nNúmero da Conta: %d \nSaldo Atual: R$ %.2f", cp.getNumConta(), cp.depositar(valor)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
