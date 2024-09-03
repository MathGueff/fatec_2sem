/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorialrecursivo;

/**
 *
 * @author Alunos
 */
public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println("Calculando o fatorial de " + numero + ": ");
        System.out.println(CalcularFatorial(numero));
    }
    
    public static int CalcularFatorial(int n){
        if(n==0 || n ==1){
            System.out.println("Fatorial de "+ n + " = " + n);
            return 1;
        }
        else{
            int resultado = n * CalcularFatorial(n-1);
            System.out.println("Fatorial de "+ n + " = " + resultado);
            return resultado;
        }
    } 
}
