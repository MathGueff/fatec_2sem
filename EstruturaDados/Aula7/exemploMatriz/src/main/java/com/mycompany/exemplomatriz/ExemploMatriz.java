/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplomatriz;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.JTextArea;

/**
 *
 * @author Alunos
 */
public class ExemploMatriz {

    public static void main(String[] args) {
        int mat[][], diag[], lin, col;
        
        lin = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas e colunas tem a matriz? "));
        col = lin;
        mat = new int [lin][col];
        
        String resposta = "Colunas\n";
        col = 0;
        for (int[] m : mat)
        {
            for(int coluna = 0; coluna < m.length; coluna++)
            {
                m[coluna] = (int) (Math.random() * 10);
            }
            resposta += "\t" + col++;
        }
        resposta += "\nLinhas";
        
        lin = 0;
        for (int[] m : mat)
        {
            resposta += "\n" + lin++;
            for(int coluna = 0; coluna < m.length; coluna++)
            {
                resposta += "\t" + m[coluna];
            }
        }
        resposta += "\n\nDiagonal Principal =";
        col = 0;
        
        for(int[] m : mat)
        {
            resposta += " " + m[col++];
        }
        
        JTextArea saida = new JTextArea(resposta);
        JOptionPane.showMessageDialog(null, saida);
        System.exit(0);
    }
}
