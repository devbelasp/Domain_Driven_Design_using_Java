package br.com.fiap.bean;

public class Televisor {
    // atributos
    private int canal;
    private int volume;
    // métodos getters e setters
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        try{
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
                this.canal = canal;
            } else {
                throw new Exception("Canal fora do ar! (canais permitidos: 2,4,5,7 e 13)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try{
            if (volume >= 0 && volume <= 20) {
                this.volume = volume;
            } else {
                throw new Exception("Volume fora da faixa permitida! (min=0 até max=20)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // métodos da classe (particulares)
    public void aumentarVolume() {
        if (volume < 20){
            volume++;
        }
    }
    public void diminuirVolume() {
        if (volume > 0){
            volume--;
        }
    }
}
