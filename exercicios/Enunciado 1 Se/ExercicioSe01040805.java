package com.turmamat2024;

import javax.swing.JOptionPane;

/*
04) Fazer um programaque leia um valor e verifique se é divisível por 3 e 5 ao
mesmo tempo
*/

public class ExercicioSe01040805 {
    
    public static void main(String [] args) {
        
        int Num = 0;
        
        Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        if (Num % 3 == 0 && Num % 5 == 0) {
            JOptionPane.showMessageDialog(null, "O número "+Num+ " é divísivel por 3 e 5 ao mesmo tempo");
        } else {
            JOptionPane.showMessageDialog(null, "O número "+Num+ " não é divísivel por 3 e 5 ao mesmo tempo");
        }
    }
}
