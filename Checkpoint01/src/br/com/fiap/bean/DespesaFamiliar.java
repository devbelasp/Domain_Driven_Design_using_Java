// Isabela dos Santos Pintos RM 563422
// Manuela de Lacerda Soares RM 564887
// Felipe Monte de Sousa RM 562019

package br.com.fiap.bean;

public class DespesaFamiliar {
    // atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    // métodos
    public double calcularTotalDeDespesas(){
        double calculoDeDespesas = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
        return calculoDeDespesas;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }
}
