package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor(); // declarando e instanciando nosso objeto
        televisor.canal = 7;
        televisor.volume = 25;
        televisor.trocarCanal(4);
        televisor.diminuirVolume();
        televisor.diminuirVolume();
        System.out.println("Canal atual: " + televisor.canal + "\nVolume atual: " + televisor.volume);
    }
}
