package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.canal = 5;
        tv.volume = 4;
        tv.trocarCanal(4);
        tv.diminuirVolume();
        tv.diminuirVolume();
        System.out.printf("Teste Televisor\nCanal atual: %d\nVolume atual: %d",tv.canal, tv.volume);

        ArCondicionado ar = new ArCondicionado();
        ar.modo = "ventilar";
        ar.temperatura = 23;
        ar.trocarModo("resfriar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        String mensagem = String.format("\nTeste Ar Condicionado\nModo atual: %s\nTemperatura atual: %d°C",ar.modo,ar.temperatura);
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
