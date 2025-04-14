package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class Main {
    public static void main(String[] args) {
        // declarando e instanciando o objeto da classe Radio
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.setEstacao(189.1f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(192.5f);
        System.out.printf("Estação: %.1fMHz \nVolume: %ddB", radio.getEstacao(),radio.getVolume());
    }
}
