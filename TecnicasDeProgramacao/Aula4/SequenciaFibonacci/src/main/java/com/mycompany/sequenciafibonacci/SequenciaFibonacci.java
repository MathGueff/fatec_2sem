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
        do{
            System.out.println("Digite um numero: ");
            numero = Integer.parseInt(System.console().readLine());
        } while (numero < 0);
        System.out.println("Calculando a sequencia de fibonnaci do numero: " + numero);
        SequenciaFibonacci fibo = new SequenciaFibonacci();
        for(int i=0; i<numero; i++){
            System.out.println(i+1 +" termo da sequencia de fibonacci: " + fibo.SequenciaFibonacci(i));
        }
    }
    
    public int t1 = 0;
    public int t2 = 1;
    
    public int SequenciaFibonacci(int n)  {
        int resultado = 0;
        if(n < 2){
            resultado = n;
        }
        else{
            resultado = SequenciaFibonacci(n-1) + SequenciaFibonacci(n-2);
        }
        return resultado;
    }
}
