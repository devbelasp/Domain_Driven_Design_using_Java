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
        String mensagem = String.format("Teste Folha De Pagamento\nSalário Bruto: %.2f\nDesconto Plano De Saúde: %.2f\nNúmero De Dependentes: %d\nDesconto Do INSS: %.0f porcento\nSalário Líquido: %.2f", salario.salarioBruto, salario.valorPlanoDeSaude, salario.numeroDeDependentes, salario.descontoINSS, resultado);
        JOptionPane.showMessageDialog(null,mensagem);



    }
}
