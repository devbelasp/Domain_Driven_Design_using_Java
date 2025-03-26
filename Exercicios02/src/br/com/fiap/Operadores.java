package br.com.fiap;

public class Operadores {
    public static void main(String[] args) {

        // Operações aritméticas com números inteiros.

        System.out.println("-----------------------------------------------------------");

        System.out.println("Operações aritméricas com números inteiros");
        System.out.println();

        int numero1 = 100, numero2 = 50;

        int somaInt = numero1 + numero2;
        int subtracaoInt = numero1 - numero2;
        int multipicacaoInt = numero1 * numero2;
        int divisaoInt = numero1 / numero2;


        System.out.println("A soma dos números " + numero1 + " + " + numero2 + " é: " + somaInt);
        System.out.println();

        System.out.println("A subtração dos números " + numero1 + " - " + numero2 + " é: " + subtracaoInt);
        System.out.println();

        System.out.println("A multiplicação dos números " + numero1 + " x " + numero2 + " é: " + multipicacaoInt);
        System.out.println();

        System.out.println("A divisão dos números " + numero1 + " / " + numero2 + " é: " + divisaoInt);
        System.out.println
                ("-------------------------------------------------------------------------------------");

        //Calculo da fórmula do IMC utilizando números decimais.

        System.out.println("Calculo da fórmula do IMC utilizando números decimais");
        System.out.println();

        float altura = 1.75f;
        float peso = 70.5f;

        float calculoImc = peso / (altura * altura);

        System.out.println("O resultado do cálculo IMC da altura " + altura + " e o peso " + peso + " é de: " + calculoImc + " - Peso Normal");

        System.out.println("-------------------------------------------------------------------------------------");

        // Calculo para converter real(Brasil) em Iene(Japão).

        System.out.println("Calculo para converter real(Brasil) em Iene(Japão).");

        float real = 0.038f;
        float iene = 1.00f;
        float quantDeIeneAserComprada = 10000;

        float convParaReal = quantDeIeneAserComprada * real;

        System.out.println(quantDeIeneAserComprada + " Ienes equivalem à " + convParaReal + " reais.");



    }
}
