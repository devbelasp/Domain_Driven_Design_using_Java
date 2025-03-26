package br.com.fiap;

public class UsaSecadorDeCabelo {
    public static void main(String[] args) {
        SecadorDeCabelo secador = new SecadorDeCabelo();
        secador.calor = 1;
        secador.ar = "Frio";
        secador.aumentarCalor();
        secador.aumentarCalor();
        secador.trocarAr("Quente");
        System.out.println("Calor do secador: " + secador.calor + "\nAr do secador: " + secador.ar);
    }
}
