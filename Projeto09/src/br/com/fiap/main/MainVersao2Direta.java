package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2Direta {
    public static void main(String[] args) {
        Pessoa pessoa1;
        Scanner scan;
        // sem variáveis de apoio
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e ano de nascimento");

            pessoa1 = new Pessoa(scan.nextLine(), scan.nextInt());

            System.out.printf("Pessoa 1 \nNome: %s \nIdade: %d anos", pessoa1.getNome(), pessoa1.calcularIdade(2025));

        } catch (Exception e) {
            System.out.println("Nome ou ano de nascimento inválido(s)");
        }
    }
}
