/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraavancada;

/**
 *
 * @author Alunos
 */
public class CalculadoraAvancada {
    
    public static void main(String[] args){
        String operacao;
        int numero1;
        int numero2;
        int numero3;
        String simbolo;
        simbolo = "";
        
        System.out.printf("Digite um valor para a operação:\n");
        System.out.printf("1 - Soma:\n");
        System.out.printf("2 - Subtração:\n");
        System.out.printf("3 - Multiplicação:\n");
        System.out.printf("4 - Divisão:\n");
        System.out.printf("5 - Potenciação:\n");
        System.out.printf("6 - Raiz quadrada\n:");
        System.out.printf("7 - Sair:\n");
        operacao = System.console().readLine("Escolha uma operacao: ");
        numero1 = Integer.parseInt(System.console().readLine("Digite um número: "));
        numero2 = Integer.parseInt(System.console().readLine("Digite o próximo número: "));
        numero3 = Integer.parseInt(System.console().readLine("Digite o terceiro número: "));
        
        if(numero3 == 0){
            CalculadoraAvancada calculadora = new CalculadoraAvancada(numero1,numero2);
            simbolo = EscolherOperacao(operacao, calculadora);
            if(simbolo == null){
                System.out.printf("A operação digitada não pode ser realizada, digite uma operação válida\n");
                while(simbolo == null){
                    operacao = System.console().readLine("Escolha uma operacao: ");
                    simbolo = EscolherOperacao(operacao, calculadora);
                }
            }
            else{
                System.out.printf("O resultado da operação %d %s %d igual a %d", calculadora.getNumero(), simbolo, calculadora.getNumero2(), calculadora.getResultado());
            }
        }
        else{
            CalculadoraAvancada calculadora = new CalculadoraAvancada(numero1,numero2,numero3);
            simbolo = EscolherOperacao(operacao, calculadora);
            if(simbolo == null){
                System.out.printf("A operação digitada não pode ser realizada, digite uma operação válida \n");
                while(simbolo == null){
                    operacao = System.console().readLine("Escolha uma operacao: ");
                    simbolo = EscolherOperacao(operacao, calculadora);
                }
            }
            else{
                System.out.printf("O resultado da operação %d %s %d igual a %d", calculadora.getNumero(), simbolo, calculadora.getNumero2(), calculadora.getResultado());
            }
        }
    }
    
    public static String EscolherOperacao(String operacao, CalculadoraAvancada calc){
        String simbolo;
        switch (operacao){
                case "1" -> {
                    calc.getSoma();
                    simbolo = "+";
                }
                case "2" -> {
                    simbolo = "-";
                }
                case "3" -> {
                    simbolo = "*";
                }
                case "4" -> {
                    simbolo = "/";
                }
                case "5" -> {
                    simbolo = "^";
                }
                default -> {
                    return null;
                }
            }
       return simbolo;
    }
    
    public static CalculadoraAvancada EscolherCalculadora(CalculadoraAvancada calc){
        return calc;
    }

    private int numero1;
    private int numero2;
    private int numero3;
    private String operacao;
    private int resultado;
    
    public CalculadoraAvancada(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public CalculadoraAvancada(int numero1, int numero2, int numero3){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }
    
    public int getNumero(){
        return numero1;
    }
    
    public void setNumero(int numero){
        this.numero1 = numero;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    public void setNumero2(int numero){
        this.numero2 = numero;
    }
    
    public int getNumero3(){
        return numero3;
    }
    
    public void setNumero3(int numero){
        this.numero3 = numero;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public void setResultado(int resultado){
        this.resultado = resultado;   
    }
    
    public int getSoma(){
        resultado = getNumero() + getNumero2() + getNumero3();
        return resultado;
    }
    
    public int getSubtracao(){
        resultado = getNumero() - getNumero2() - getNumero3();
        return resultado;
    }
    
    public int getMultiplicacao(){
        resultado = getNumero() * getNumero2();
        if(getNumero3() != 0){
            resultado *= getNumero3();
        }
        return resultado;
    }
    
    public int getDivisao(){
        resultado = getNumero() / getNumero2();
        if(getNumero3() != 0){
            resultado /= getNumero3();
        }
        return resultado;
    }
    
    public int getPotencia(){
        resultado = (int) Math.pow(getNumero(), getNumero2());
        if(getNumero3() != 0){
            resultado = (int) Math.pow(resultado, getNumero3());
        }
        return resultado;
    }
}
