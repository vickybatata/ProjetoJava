package com.turmamat2024;

import javax.swing.JOptionPane;

/*
09) Fazer um programa que leia dois valores e retorne qual é o maior

*/

public class ExercicioSe01090805 {
    public static void main (String [] args) {
        
        double Valor1, Valor2 = 0;
        
        Valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        
        Valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        if (Valor1 > Valor2) {
            JOptionPane.showMessageDialog(null, "O primeiro valor " +Valor1+ " é maior que o segundo valor " +Valor2);
       }else if (Valor2 > Valor1) {
           JOptionPane.showMessageDialog(null, "O segundo valor " +Valor2+ " é maior que o primeiro valor " +Valor1);
      }else {
           JOptionPane.showMessageDialog(null, "Os dois valores são iguais");
       }
    }
}
