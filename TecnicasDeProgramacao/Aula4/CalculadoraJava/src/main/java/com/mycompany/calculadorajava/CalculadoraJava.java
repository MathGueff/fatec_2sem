/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorajava;

/**
 *
 * @author Alunos
 */
public class CalculadoraJava {

    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        String operacao = "";
        int numero3 = 0;
        System.out.println("Digite uma operacao: ");
        operacao = System.console().readLine();
        System.out.println("Digite um valor para o primeiro numero: ");
        numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite um valor para o segundo numero: ");
        numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite um valor para o terceiro numero: ");
        numero3 = Integer.parseInt(System.console().readLine());
        
        if(numero3 == 0){
            CalculadoraJava calc = new CalculadoraJava(numero1,numero2,operacao);
            //System.out.println(calc.Calcular(calc.getNum1(), calc.getNum2(), calc.getOp()));
            System.out.printf("O resultado de %d %s %d = %d", calc.getNum1(), calc.getOp(), 
                calc.getNum2(), calc.Calcular(calc.getNum1(), calc.getNum2(), calc.getOp())
            );
        }
        else{
            CalculadoraJava calc = new CalculadoraJava(numero1, numero2, operacao, numero3);
            System.out.printf("O resultado de %d %s %d %s %d = %d", calc.getNum1(), calc.getOp(), 
                calc.getNum2(), calc.getOp(), calc.getNum3(), calc.Calcular(calc.getNum1(), 
                calc.getNum2(), calc.getOp())
            );
        }
    }
    
    public CalculadoraJava(int num1, int num2, String op){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }
    
    public CalculadoraJava(int num1, int num2, String op, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.num3 = num3;
    }
    
    private int num1;
    private int num2;
    private int num3;
    private String op;
    private int resultado;
    
    public int getNum1(){
        return this.num1;
    }
    
    public void setNum1(int num1){
        this.num1 = num1;
    }
    
    public int getNum2(){
        return this.num2;
    }
    
    public void setNum2(int num2){
        this.num2 = num2;
    }
    
    public int getNum3(){
        return this.num3;
    }
    
    public void setNum3(int num3){
        this.num3 = num3;
    }
    
    public String getOp(){
        return this.op;
    }
    
    public void setOp(String op){
        this.op = op;
    }
    
    public int Calcular(int n1, int n2, String op){
        switch(getOp()){
            case "+" -> {
                resultado = getNum1() + getNum2();
            }
            case "-" -> {
                resultado = getNum1() - getNum2();
            }
            case "/" -> {
                resultado = getNum1() / getNum2();
            }
            case "*" -> {
                resultado = getNum1() * getNum2();
            }
            case "^" -> {
                resultado = (int) Math.pow(getNum1(), getNum2());
            }
        }
        return resultado;
    }
    
    public int Calcular(int n1, int n2, String op, int n3){
        switch(getOp()){
            case "+" -> {
                resultado = getNum1() + getNum2() + getNum3();
            }
            case "-" -> {
                resultado = getNum1() - getNum2() - getNum3();
            }
            case "/" -> {
                resultado = getNum1() / getNum2() / getNum3();
            }
            case "*" -> {
                resultado = getNum1() * getNum2() * getNum3();
            }
            case "^" -> {
                resultado = (int) Math.pow(getNum1(), getNum2());
                resultado = (int) Math.pow(resultado, getNum3());
            }
        }
        return resultado;
    }
}
