/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeteste;

/**
 *
 * @author Alunos
 */
public class Teste_Classe {
    
    public static void main(String[] args) ​
    {​
        // Cria a classe para calcular o dobro de um número passado​

        Teste_Classe nova = new Teste_Classe(1);​

        System.out.println("Resultado é: "+nova.getDobro());​

        // Cria a classe para calcular a multiplicação de 2 números passados​

        Teste_Classe nova2 = new Teste_Classe(15,10);​

        System.out.println("Resultado é: "+nova2.getMultiplica());​
    }​
        
    public Teste_Classe(int numero) {// método construtor com 1 número​
        super();​
        this.numero = numero;​
    }​

    public Teste_Classe(int numero, int numero2) {// método construtor com 2 números​
        super();​
        this.numero = numero;​
        this.numero2 = numero2;​
    }​

    public Teste_Classe(int numero, int numero2) {​
        super();​
        this.numero = numero;​
        this.numero2 = numero2; ​
    } 

    // Método get do Numero​

    public int getNumero() {​
        return numero;​
    }​

    // Método set do Numero​

    public void setNumero(int numero) {​
        this.numero = numero;​
    }​

    // Métodos get do número2​

    public int getNumero2() {​
        return numero2;​
    }​

    // Métodos set do número2​

    public void setNumero2(int numero) {​

        this.numero2 = numero;​

    }​
    // Método get do resultado​

    public int getResultado() {​

        return resultado;​

    }​

    // Método set do resultado​

    public void setResultado(int resultado) {​

        this.resultado = resultado;​

    }​
    
    // Método set do resultado​

    public void setResultado(int resultado) {​

        this.resultado = resultado;​

    }​

    // Conteúdo da sua classe - variáveis utilizadas na classe​

    private int numero; // define o número como privado para ser utilizado aqui​

    private int numero2; // define o número como privado para ser utilizado aqui​

    private int resultado; // define o resultado como público para ser utilizado em seu objeto​
    
    public int getDobro() // retorna o dobro de um número​
    {​
        resultado = getNumero() * 2;​
        return resultado;​
    }​

    public int getMultiplica() // retorna o dobro de um número​
    {​
        resultado = getNumero() * getNumero2();​
        return resultado;​
    }​
    // Método get do resultado​

    public int getResultado() {​

        return resultado;​

    }​

    // Método set do resultado​

    public void setResultado(int resultado) {​

        this.resultado = resultado;​

    }​
    
    // Método set do resultado​

    public void setResultado(int resultado) {​

        this.resultado = resultado;​

    }​

    // Conteúdo da sua classe - variáveis utilizadas na classe​

    private int numero; // define o número como privado para ser utilizado aqui​

    private int numero2; // define o número como privado para ser utilizado aqui​

    private int resultado; // define o resultado como público para ser utilizado em seu objeto​
    
    public int getDobro() // retorna o dobro de um número​
    {​
        resultado = getNumero() * 2;​
        return resultado;​
    }​

    public int getMultiplica() // retorna o dobro de um número​
    {​
        resultado = getNumero() * getNumero2();​
        return resultado;​
    }​
}
