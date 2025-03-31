package br.com.fiap.bean;

public class FolhaDePagamento {
    // atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;
    // métodos
    public double calcularSalarioLiquido(){
        double desc1 = (numeroDeDependentes + 1) * valorPlanoDeSaude;
        double desc2 = salarioBruto * (descontoINSS/100);
        double salarioLiquido = salarioBruto - desc1 - desc2;
        return salarioLiquido;
    }
}
