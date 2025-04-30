package br.com.fiap;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
        try {
            // data inicial
            String dataInicial = JOptionPane.showInputDialog("Digite data inicial (ex: dd/MM/yyyy)");
            String dia = dataInicial.substring(0,2);
            String mes = dataInicial.substring(3,4);
            String ano = dataInicial.substring(5,8);
            String dataI = ano+"/"+mes+"/"+dia;
            // data final
            String dataFinal = JOptionPane.showInputDialog("Digite data final (ex: dd/MM/yyyy)");
            String dia1 = dataFinal.substring(0,2);
            String mes1 = dataFinal.substring(3,4);
            String ano1 = dataFinal.substring(5,8);
            String dataF = ano1+"/"+mes1+"/"+dia1;

            // transformando em data
            LocalDate dataInicial2 = LocalDate.parse(dataI);
            LocalDate dataFinal2 = LocalDate.parse(dataF);
            JOptionPane.showMessageDialog(null,dataI);
            JOptionPane.showMessageDialog(null,dataF);

            // período entre datas
            //Period period = Period.between(dataInicial2, dataFinal2);
            //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // mostransdo resultado
            //String resultado = String.format("Data inicial: %s \nData final: %s \nEntre as datas fornecidas existem %d ano(s), %d mês(s) e %d dia(s)!", dataInicial2.format(dtf), dataFinal2.format(dtf), period.getYears(), period.getMonths(), period.getDays());

           // JOptionPane.showMessageDialog(null, resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Valor inválido!");
        }
    }
}
