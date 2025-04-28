package br.com.fiap;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
        try {
            //LocalDate dataInicial = LocalDate.parse("1998-06-24");
            //LocalDate dataFinal = LocalDate.now();
            String dataInicial = JOptionPane.showInputDialog("Digite data inicial: dd/MM/yyyy");
            dataInicial.substring()


            LocalDate dataInicial2 = LocalDate.parse(dataInicial);

            Period period = Period.between(dataInicial, dataFinal);
            //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            //String resultado = String.format("Data inicial: %s \nData final: %s \nEntre as datas fornecidas existem %d ano(s), %d mês(s) e %d dia(s)!", dataInicial.format(dtf), dataFinal.format(dtf), period.getYears(), period.getMonths(), period.getDays());

            JOptionPane.showMessageDialog(null, resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Valor inválido!");
        }
    }
}
