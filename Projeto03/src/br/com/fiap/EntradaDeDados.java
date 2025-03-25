package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner scan; // declaração do objeto scan
        try {
            scan = new Scanner(System.in); // instanciação do objeto scan
            System.out.println("Digite dois números inteiros");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nSoma dos valores: " + resultado);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");;
        }
    }
}
