/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraymatrizcollections;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Alunos
 */
public class ExemploVetor {
    public static void main(String[] args) {
        int v[] = new int[10];
        for(int i=0;i < v.length; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1)+ "º elemento (posição " +i+")"));
        }
        String resposta = "Posição \tValor";
        for(int i = 0; i<v.length; i++){
            resposta+= "\nv["+ i +"]\t"+v[i];
        }
        //Cria uma textArea para exibir os resultados, precisa do import de javax.swing.JTextArea
        JTextArea saida = new JTextArea(11,10);
        saida.setText(resposta);
        JOptionPane.showMessageDialog(null, saida);
        System.exit(0);
    }
}
