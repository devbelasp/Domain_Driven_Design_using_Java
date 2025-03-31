package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class TesteFolhaDePagamento {
    public static void main(String[] args) {
        FolhaDePagamento salario = new FolhaDePagamento();
        salario.salarioBruto = 20000.00;
        salario.valorPlanoDeSaude = 90.00;
        salario.numeroDeDependentes = 2;
        salario.descontoINSS = 12;
        double resultado = salario.calcularSalarioLiquido();
        String mensagem = String.format("Teste Folha De Pagamento\nSalário Bruto: %.2f\nDesconto do plano de saúde: %.2f * 3 (2 pessoas como dependentes + funcionário)\nDesconto do INSS: %.0f pocento\nSalário Líquido: %.2f", salario.salarioBruto, salario.valorPlanoDeSaude, salario.descontoINSS, resultado);
        JOptionPane.showMessageDialog(null,mensagem);



    }
}
