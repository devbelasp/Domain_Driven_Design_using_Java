package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        //declaração e inicialização (opcional) de variáveis
        char sexo = 'F';
        byte idade = 35;
        short codigo = 15635;
        int alunos = 50, classes = 11;
        long brasileiros = 216535103700L;
        float media = 8.55f;
        double dolar = 5.68;
        boolean alternativa = false;
        String nomeCompleto = "Astrogildo Planetário Celeste";

        System.out.println("Sexo: " + sexo + " Idade: " + idade + " anos");
        System.out.println("Código: " + codigo + " Alunos: " + alunos + " Turmas: " + classes + " Média: " + media);
        System.out.println("Habitantes: " + brasileiros + " Cotação do dólar: U$ " + dolar + " Alternativa: " + alternativa);
        System.out.println("Nome: " + nomeCompleto);

    }
}
