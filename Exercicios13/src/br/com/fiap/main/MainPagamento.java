package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim", nome;
        float valorHoraTrabalhado, salario, adicionalNoturno, comissao;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de funcionário deseja calcular o salário? \n(1) Funcionário \n(2) Vigia Noturno \n(3) Vendedor");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Favor digitar o nome do funcionário:");
                        auxiliar = JOptionPane.showInputDialog("Valor da hora de trabalho desse funcionário:");
                        valorHoraTrabalhado = Float.parseFloat(auxiliar);
                        Funcionario funcionario = new Funcionario(nome,valorHoraTrabalhado);
                        salario = funcionario.calcularSalario();
                        JOptionPane.showMessageDialog(null,String.format("Nome do funcionário: %s \nSalário do funcionário: %.2f", nome, salario));
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Favor digitar o nome do funcionário:");
                        auxiliar = JOptionPane.showInputDialog("Valor da hora de trabalho desse funcionário:");
                        valorHoraTrabalhado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Valor do adicional noturno desse funcionário:");
                        adicionalNoturno = Float.parseFloat(auxiliar);
                        VigiaNoturno vigiaNoturno = new VigiaNoturno(nome, valorHoraTrabalhado, adicionalNoturno);
                        salario = vigiaNoturno.calcularSalario();
                        JOptionPane.showMessageDialog(null,String.format("Nome do funcionário: %s \nSalário do funcionário: %.2f", nome, salario));
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Favor digitar o nome do funcionário:");
                        auxiliar = JOptionPane.showInputDialog("Valor da hora de trabalho desse funcionário:");
                        valorHoraTrabalhado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Valor da comissão do funcionário:");
                        comissao = Float.parseFloat(auxiliar);
                        Vendedor vendedor = new Vendedor(nome, valorHoraTrabalhado, comissao);
                        salario = vendedor.calcularSalario();
                        JOptionPane.showMessageDialog(null,String.format("Nome do funcionário: %s \nSalário do funcionário: %.2f", nome, salario));
                        break;
                    default:
                        throw new Exception("Escolha incorreta.");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa. Volte sempre.");
    }
}
