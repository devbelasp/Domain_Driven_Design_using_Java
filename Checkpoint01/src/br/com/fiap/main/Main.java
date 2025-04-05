// Isabela dos Santos Pintos RM 563422
// Manuela de Lacerda Soares RM 564887
// Felipe Monte de Sousa RM 562019

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar(); // declarando e instanciando

        // declarando variáveis
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
        int numeroDeMoradores;

        Scanner scan; // declaração do objeto scan
        try {
            scan = new Scanner(System.in); // instanciação do objeto scan

            // leitura dos valores e armazenamento em variáveis
            System.out.print("Digite a renda familiar mensal: ");
            rendaFamiliar = scan.nextDouble();
            System.out.print("Digite o número de moradores em sua residência: ");
            numeroDeMoradores = scan.nextInt();
            System.out.print("Informe o gasto mensal de luz: ");
            gastoComLuz = scan.nextDouble();
            System.out.print("Informe o gasto mensal de água: ");
            gastoComAgua = scan.nextDouble();
            System.out.print("Informe o gasto mensal com internet: ");
            gastoComInternet = scan.nextDouble();
            System.out.print("Informe a mensalidade da sua academia: ");
            valorMensalidadeDaAcademia = scan.nextDouble();

            // atribuindo os valores aos atributos da classe DespesaFamiliar
            despesa.rendaFamiliar = rendaFamiliar;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            // exibindo os valores e resultado
            System.out.printf("Valor da renda familiar: R$ %.3f\nTotal de gastos com despesas: R$ %.3f\nValor da renda familiar líquida: R$ %.3f", despesa.rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida());

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }

    }
}
