package br.com.fiap.bean;

import javax.swing.*;

public class ContaBancaria {
    // atributos
    private String cliente;
    private int numConta;
    private float saldo;
    // construtores
    public ContaBancaria() {
    }
    // métodos getters e setters
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    // métodos da classe (particulares)
    public float sacar(float valor) {
        if (saldo >= valor) {
            saldo = getSaldo() - valor;
        } else{
            JOptionPane.showMessageDialog(null, "Número do saque não pode ser maior que o valor do saldo na conta.");
        }
        return saldo;
    }
    public float depositar (float valor){
        return valor + saldo;
    }
}
