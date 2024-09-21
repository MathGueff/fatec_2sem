/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraymatrizcollections;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class SomaVetor {
    public static void main(String[] args) {
        int a[] = {1,2,4,8,6,7,15,9,10,18};
        int total = 0;
        String saida = "Elementos do vetor \n";
        for(int i=0;i<a.length;i++){
            saida+= a[i]+ " ";
            total += a[i];
        }
        //Cria uma janela de diálogo (precisa do import do javax.swing.JOptionPane
        JOptionPane.showMessageDialog(null, saida+"\nSoma do vetor " + total, "Soma dos elementos do vetor", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
