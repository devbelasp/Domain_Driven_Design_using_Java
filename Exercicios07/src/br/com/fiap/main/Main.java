package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.setVolume(15);
        televisor.setCanal(7);
        televisor.aumertarVolume();
        televisor.aumertarVolume();
        televisor.aumertarVolume();
        System.out.printf("Volume: %d\nCanal: %d",televisor.getVolume(), televisor.getCanal());
    }
}
