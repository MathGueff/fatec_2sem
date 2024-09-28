/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraymultidimensional;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ArrayMultidimensional {

    public static void main(String[] args) {
        int b[][];
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas e colunas? "));
        b = new int[x][x];
        for(int linha = 0; linha < b.length; linha++)
        {
            System.out.printf("| \t");
            for(int coluna = 0; coluna < b[linha].length; coluna++)
            {
                b[linha][coluna] = (int) Math.pow(linha, coluna);
                System.out.printf("a[%d][%d] = %d \t", linha, coluna, b[linha][coluna]);
            }
            System.out.printf("| \n");
        }
        System.out.printf("%dx%d \n", x, x );
    }
}
