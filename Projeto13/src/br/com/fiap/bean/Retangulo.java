package br.com.fiap.bean;

public class Retangulo extends Quadrado {
    // atributos
    private float altura;
    // construtores
    public Retangulo(){

    }
    public Retangulo(float lado, float altura) {
        super(lado); // super.setlado(lado);
        this.altura = altura;
    }
    // métodos getters e setters
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    // métodos da classe (particulares)
    public float calcularArea() {
        return altura * super.getLado();
    }
}
