package br.com.fiap;

import javax.swing.*;

public class ManipulaString {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Digite uma frase:");
            JOptionPane.showMessageDialog(null,frase);
            JOptionPane.showMessageDialog(null, frase.length());
            JOptionPane.showMessageDialog(null, frase.toUpperCase());
            String palavra1 = JOptionPane.showInputDialog("Digite uma palavra que a frase possui:");
            String palavra2 = JOptionPane.showInputDialog("Digite outra palavra que deseja substituir pela primeira palavra digitada:");
            String frase2 = frase.replace(palavra1,palavra2);
            JOptionPane.showMessageDialog(null, frase2);
            JOptionPane.showMessageDialog(null, frase2.length());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Frase inválida!");
        }
    }
}
