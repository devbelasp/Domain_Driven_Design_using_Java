package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String auxiliar;

        try {
            // leitura dos valores e armazenamento em variáveis
            auxiliar = JOptionPane.showInputDialog("Digite Salário Bruto");
            salarioBruto = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite número de dependentes");
            numeroDeDependentes = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite desconto do INSS");
            descontoINSS = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite valor do Plano de Saúde");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);

            // atribuir valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            // exibindo valores e resultado
            String mensagem = String.format("Salário Bruto: R$ %.2f\nNúmero de Dependentes: %d\nDesconto do INSS: %.1f%%\nDesconto do Plano de Saúde: R$ %.2f\nSalário Líquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null,mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número incorreto");
        }
    }
}
