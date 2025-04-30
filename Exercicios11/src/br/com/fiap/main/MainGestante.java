package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gravida1;
        String nome, dataInicio, dataBrasil;
        LocalDate dataDaGestacao;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome");
            dataInicio = JOptionPane.showInputDialog("Digite inicio da gestação (dia/mês/ano)");

            dataDaGestacao = LocalDate.parse(dataInicio,dtf);
            gravida1 = new Gestante(nome,dataDaGestacao);

            dataBrasil = gravida1.getDataDaGestacao().format(dtf);
            JOptionPane.showMessageDialog(null, String.format("Exibindo informações \nNome: %s \nData de gestação: %s \nTempo de gestação: %d mês(es)", gravida1.getNome(), dataBrasil, gravida1.tempoDeGestacao()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
