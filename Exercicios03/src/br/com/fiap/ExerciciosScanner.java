package br.com.fiap;

import java.util.Scanner;

public class ExerciciosScanner {
    public static void main(String[] args) {
        /*
        1. Monte um programa que peça para o usuário digitar as notas das 4 provas (prova1, prova2, prova3 e prova4) e exiba a média aritmética simples.
         */

        float nota1, nota2, nota3, nota4, media; //variáveis
        Scanner scan; // declaração do objeto
        try {
            scan = new Scanner(System.in); // instanciação do objeto
            System.out.println("Digite os valores das 4 provas abaixo e veja sua média");
            System.out.print("Nota 1: ");
            nota1 = scan.nextFloat();
            System.out.print("Nota 2: ");
            nota2 = scan.nextFloat();
            System.out.print("Nota 3: ");
            nota3 = scan.nextFloat();
            System.out.print("Nota 4: ");
            nota4 = scan.nextFloat();
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("Sua média é: " + media);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }

        System.out.println("-----------------------------------------------------------------");

        /*
        2. Monte um programa que peça para o usuário digitar o ano atual e o ano de seu nascimento exiba ao final a idade deste usuário.
         */

        int anoAtual, anoDeNascimento, idadeDoUsuario;
        try {
            scan = new Scanner(System.in);
            System.out.println("Descobrindo a idade do usuário");
            System.out.print("Digite o ano atual: ");
            anoAtual = scan.nextInt();
            System.out.print("Digite seu ano de nascimento: ");
            anoDeNascimento = scan.nextInt();
            idadeDoUsuario = anoAtual - anoDeNascimento;
            System.out.println("A idade do usuário é: " + idadeDoUsuario + " anos");

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }

        System.out.println("-----------------------------------------------------------------");

        /*
        3. Monte um programa que peça para o usuário digitar o valor do raio de um círculo e exiba a área deste círculo (lembrete: área do círculo = PI * raio²)
         */

        double raioDoCirculo, areaDoCirculo;
        try {
            scan = new Scanner(System.in);
            System.out.println("Descobrindo o valor da área do círculo");
            System.out.print("Digite o valor do raio de um círculo em cm: ");
            raioDoCirculo = scan.nextDouble();
            areaDoCirculo = Math.PI * Math.pow(raioDoCirculo,2);
            System.out.println("A área deste círculo é de: " + areaDoCirculo + "cm²");

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}

