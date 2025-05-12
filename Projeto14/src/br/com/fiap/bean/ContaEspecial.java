package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial extends ContaBancaria{
    // atributos
    private float limite;
    // construtores
    public ContaEspecial() {
    }
    // métodos getters e setters
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    // métodos da classe (particulares)
    public float sacar (float valor) {
        float resultado = 0;
        if (valor <= super.getSaldo() + limite) {
            resultado = super.getSaldo() - valor;
        } else {
            JOptionPane.showMessageDialog(null, "Número do saque está maior que o limite.");
        }
        return resultado;
    }
}