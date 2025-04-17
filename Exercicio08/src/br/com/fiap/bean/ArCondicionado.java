package br.com.fiap.bean;

public class ArCondicionado {
    // atributos
    private int temperatura;
    private String modo;
    // métodos getters e setters
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura <= 26) {
                this.temperatura = temperatura;
            } else {
                throw new Exception("Temperatura não permitida (min=15 até max=26)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        try {
            if (modo.equalsIgnoreCase("Ventilar") || modo.equalsIgnoreCase("Aquecer") || modo.equalsIgnoreCase("Resfriar")) {
                this.modo = modo;
            } else {
                throw new Exception("Modo inválido. Os modos permitidos são: Ventilar, Aquecer ou Resfriar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // métodos da classe (particulares)
    public void aumentarTemperatura() {
        if (temperatura < 26) {
            temperatura++;
        }
    }
    public void diminuirTemperatura(){
        if (temperatura > 15) {
            temperatura--;
        }
    }

}
