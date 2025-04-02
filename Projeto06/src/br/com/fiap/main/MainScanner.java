package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento(); // declarando e instanciando

        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;

        Scanner scan; // declaração do objeto scan
        try {
            scan = new Scanner(System.in); // instanciação do objeto scan

            // leitura dos valores e armazenamento em variáveis
            System.out.print("Digite Salário Bruto: ");
            salarioBruto = scan.nextDouble();
            System.out.print("Digite número de dependentes: ");
            numeroDeDependentes = scan.nextInt();
            System.out.print("Digite desconto INSS: ");
            descontoINSS = scan.nextDouble();
            System.out.print("Digite valor plano de saúde: ");
            valorPlanoDeSaude = scan.nextDouble();

            // atribuir os valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            // exibindo os valores e resultado
            System.out.printf("Salário Bruto: R$ %.2f \nN° de Dependentes: %d \nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}





