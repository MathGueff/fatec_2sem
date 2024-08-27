/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classe_testex;

/**
 *
 * @author Alunos
 */
public class Classe_TesteX {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public Classe_TesteX(int numero1){
        super();
        this.numero1 = numero1;
    }
    
    public Classe_TesteX(int numero1, int numero2){
        super();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getNumero(int numero1){
        return numero1;
    }
    public int getNumero2(int numero2){
        return numero2;
    }
    
    public void setNumero(int numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    private int numero1;
    private int numero2;
    private int resultado;
    
    public int Dobro(){
        resultado = getNumero(numero1) * 2;
        return resultado;
    }
    
}
