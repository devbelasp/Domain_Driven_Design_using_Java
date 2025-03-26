package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arcondicionado = new ArCondicionado();
        arcondicionado.temperatura = 23;
        arcondicionado.modo = "aquecer";
        arcondicionado.aumentarTemperatura();
        arcondicionado.trocarModo("vertilar");
        System.out.println("Temperatura atual: " + arcondicionado.temperatura + "\nModo atual: " + arcondicionado.modo);
    }
}
