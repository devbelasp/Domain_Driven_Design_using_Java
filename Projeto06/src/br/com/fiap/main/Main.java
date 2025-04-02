package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.salarioBruto = 10000;
        folha.numeroDeDependentes = 9;
        folha.descontoINSS = 10;
        folha.valorPlanoDeSaude = 200;
        System.out.printf("Salário Bruto: R$ %.2f \nN° de Dependentes: %d \nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
    }
}
