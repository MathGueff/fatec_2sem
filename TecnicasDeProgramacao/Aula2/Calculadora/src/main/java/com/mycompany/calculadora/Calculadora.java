/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Alunos
 */
public class Calculadora {
    
    public static void main(String[] args) {
        String operacao;
        int x;
        int y;
        
        int resultado;
        resultado = 0;
        
        System.out.printf("Digite um valor para a operação:\n");
        System.out.printf("1 - Soma:\n");
        System.out.printf("2 - Subtração:\n");
        System.out.printf("3 - Divisão:\n");
        System.out.printf("4 - Multiplicação:\n");
        System.out.printf("5 - Potenciação:\n");
        System.out.printf("6 - Raiz quadrada\n:");
        System.out.printf("7 - Sair:\n");
        
        operacao = System.console().readLine("Escolha uma operação: ");
        switch(operacao){

            case "1" -> {
                x = Integer.parseInt(System.console().readLine("Digite um valor: "));
                y = Integer.parseInt(System.console().readLine("Digite o segundo valor: "));
                resultado = x+y;
                System.out.printf("%d + %d = %d%n", x, y, resultado);
            }
            case "2" -> {
                x = Integer.parseInt(System.console().readLine("Digite um valor: "));
                y = Integer.parseInt(System.console().readLine("Digite o segundo valor: "));
                resultado = x-y;
                System.out.printf("%d - %d = %d%n", x, y, resultado);
            }
            case "3" -> {
                x = Integer.parseInt(System.console().readLine("Digite um valor: "));
                y = Integer.parseInt(System.console().readLine("Digite o segundo valor: "));
                if(y == 0){
                    System.out.printf("Não é possível dividir por zero!");
                }
                else{
                    resultado = x/y;
                    System.out.printf("%d / %d = %d%n", x, y, resultado);  
                }
            }
            case "4" -> {
                x = Integer.parseInt(System.console().readLine("Digite um valor: "));
                y = Integer.parseInt(System.console().readLine("Digite o segundo valor: "));
                resultado = x*y;
                System.out.printf("%d * %d = %d%n", x, y, resultado);
            }
            case "5" -> {
                x = Integer.parseInt(System.console().readLine("Digite um valor: "));
                y = Integer.parseInt(System.console().readLine("Digite o segundo valor: "));
                if(y == 0){
                    resultado = 1;
                }
                else{  
                    resultado = (int) Math.pow(x,y);
                    /* int i;
                    resultado = x;
                    for(i=1;i<y;i++){
                        resultado *= x;
                    }
                    */
                    System.out.printf("%d ^ %d = %d%n", x, y, resultado);
                }
            }
            case "6" -> {
                x = Integer.parseInt(System.console().readLine("Digite um valor: "));
                resultado = (int) Math.sqrt(x);
                System.out.printf("Raiz quadrada de %d = %d", x, resultado);
            }
            case "7" ->{
               break;
            }
            default -> {
                System.out.printf("Digite uma operação válida");
            }

        }
        System.out.printf("Resultado igual a %d%n", resultado);

    }
}
