/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sequenciafibonacci;

/**
 *
 * @author Alunos
 */
public class SequenciaFibonacci {

    public static void main(String[] args) {
        int numero;
        System.out.println("Digite um número: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("Calculando a sequência de fibonnaci do número" + numero);
        System.out.println(fibonacci(numero));
    }
    
    public static int fibonacci(int n)  {
        if (n < 2) return n;
        System.out.println(n);
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
