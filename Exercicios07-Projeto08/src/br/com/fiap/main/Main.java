package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
/*      televisor.setCanal(17);
        televisor.setVolume(19);
        televisor.aumentarVolume();
        televisor.aumentarVolume();*/
        Scanner scan;
        int escolha;
        try{
            scan = new Scanner(System.in);
            System.out.println("Digite o canal");
            televisor.setCanal(scan.nextInt());
            System.out.println("Digite o volume");
            televisor.setVolume(scan.nextInt());

            System.out.println("Faça sua escolha \n(1) Definir novo canal \n(2) Definir novo volume \n(3) Aumentar volume \n(4) Diminuir volume");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o novo canal");
                televisor.setCanal(scan.nextInt());
            } else if (escolha == 2) {
                System.out.println("Digite o novo volume");
                televisor.setVolume(scan.nextInt());
            } else if (escolha == 3) {
                televisor.aumentarVolume();
                System.out.println("Aumentando volume...");
            } else {
                televisor.diminuirVolume();
                System.out.println("Diminuindo volume...");
            }

            System.out.printf("Canal atual: %d\nVolume atual: %d", televisor.getCanal(), televisor.getVolume());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
