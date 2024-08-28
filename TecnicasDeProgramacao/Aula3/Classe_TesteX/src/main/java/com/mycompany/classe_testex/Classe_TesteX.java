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
        Classe_TesteX objeto = new Classe_TesteX(3);
        System.out.printf("O resultado de %d * 2 e: %d ", objeto.getNumero() ,objeto.Dobro());
        Classe_TesteX objeto2 = new Classe_TesteX(3,8);
        System.out.printf("O resultado de %d * %d e: %d ", objeto2.getNumero(), objeto2.getNumero2() ,objeto2.Multiplica());
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
    
    public int getNumero(){
        return numero1;
    }
    
    public int getNumero2(){
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
        resultado = getNumero() * 2;
        return resultado;
    }
    
    public int Multiplica(){
        resultado = getNumero() * getNumero2();
        return resultado;
    }
    
}
