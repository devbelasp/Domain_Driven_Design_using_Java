package br.com.fiap;

import javax.swing.*;

public class ExerciciosJOptionPane {
    public static void main(String[] args) {
        /*
        1. Monte um programa que peça para o usuário digitar as notas das 4 provas (prova1, prova2, prova3 e prova4) e exiba a média aritméticasimples.
         */

        float nota1, nota2, nota3, nota4, media;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite valor da nota 1");
            nota1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite valor da nota 2");
            nota2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite valor da nota 3");
            nota3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite valor da nota 4");
            nota4 = Float.parseFloat(auxiliar);
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            JOptionPane.showMessageDialog(null,"Sua média é " + media);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }


        /*
        2. Monte um programa que peça para o usuário digitar o ano atual e o ano de seu nascimento exiba ao final a idade deste usuário.
         */

        int anoAtual, anoDeNascimento, idadeDoUsuario;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
            anoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento");
            anoDeNascimento = Integer.parseInt(auxiliar);
            idadeDoUsuario = anoAtual - anoDeNascimento;
            JOptionPane.showMessageDialog(null,"Você tem " + idadeDoUsuario + " anos");

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }

        /*
        3. Monte um programa que peça para o usuário digitar o valor do raio de um círculo e exiba a área deste círculo (lembrete: área do círculo = PI * raio²)
         */

        double raioDoCirculo, areaDoCirculo;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o valor do raio de um círculo em cm");
            raioDoCirculo = Double.parseDouble(auxiliar);
            areaDoCirculo = Math.PI * (raioDoCirculo * raioDoCirculo);
            JOptionPane.showMessageDialog(null,"O valor da área deste círculo é de " + areaDoCirculo + " cm²");

        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
