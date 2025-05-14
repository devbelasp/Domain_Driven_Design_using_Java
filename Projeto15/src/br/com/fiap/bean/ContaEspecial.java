package br.com.fiap.bean;
/**
 * Classe para objetos do tipo ContaEspecial
 * @author Isabela Santos
 * @version 1.0
 */
public class ContaEspecial implements ContaBancaria{
    // atributos
    private int numConta;
    private float saldo;
    private float limite;
    // construtores
    public ContaEspecial() {
    }
    // métodos getters/setters
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
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    // métodos da classe (particulares)
    /**
     * Metodo sacar que permite sacar o valor informado
     * Valor a ser sacado nao pode ser superior ao valor do saldo atual + limite
     * @author Isabela Santos
     * @param valor - valor indicado para ser sacado
     * @return - valor do saldo (atualizado)
     */
    public float sacar(float valor) {
        try {
            if(valor <= (saldo + limite)) {
                saldo -= valor;
            } else {
                throw new Exception("Saldo insuficiente!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }
    /**
     *Metodo depositar que permite depositar o valor informado
     * @author Isabela Santos
     * @param valor - valor indicado para ser depositado
     * @return - valor do saldo (atualizado)
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}

