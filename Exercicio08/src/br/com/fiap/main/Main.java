package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        Scanner scan;
        int escolha;
        try {
            scan = new Scanner(System.in);
            System.out.println("Escolha um modo e defina a temperatura");
            ar.setModo(scan.next());
            ar.setTemperatura(scan.nextInt());

            System.out.println("Faça a sua escolha \n(1) Definir novo modo \n(2) Aumentar temperatura \n(3) Diminuir temperatura");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Digite novo modo");
                ar.setModo(scan.next());
            } else if (escolha == 2) {
                System.out.println("Aumentando temperatura...");
                ar.aumentarTemperatura();
            } else {
                System.out.println("Diminuindo temperatura...");
                ar.diminuirTemperatura();
            }
            System.out.printf("Modo atual: %s \nTemperatura atual: %d° C", ar.getModo(), ar.getTemperatura());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
