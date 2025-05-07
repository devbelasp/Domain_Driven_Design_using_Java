package br.com.fiap.bean;

public class Quadrado {
    // atributos
    private float lado;
    // construtores
    public Quadrado() {
    }
    public Quadrado(float lado) {
        this.lado = lado;
    }
    // métodos getters e setters

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    // métodos da classe (particulates)
    public float calcularArea() {
        return lado * lado;
    }
}
