/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosestruturadedados;

/**
 *
 * @author Alunos
 */
public class ExerciciosEstruturaDeDados {

    public static void main(String[] args) {
        
        int qtdNumeros;
        System.out.printf("Digite uma quantidade de numeros para o array: ");
        qtdNumeros = Integer.parseInt(System.console().readLine());
        linhaFormatada();
        int[] a = new int[qtdNumeros];
        int n = a.length;
        int max;
        // Valores do Array
        for(int i=0; i<qtdNumeros; i++){
            int num;
            System.out.printf("Digite o numero %d: ", i+1);
            num = Integer.parseInt(System.console().readLine());
            a[i] = num;
        }
        linhaFormatada();
        // Valor máximo para o exercício 4
        System.out.printf("Digite o valor maximo: ");
        max = Integer.parseInt(System.console().readLine());
        linhaFormatada();
        int x;
        System.out.printf("Digite o valor de x: ");
        x = Integer.parseInt(System.console().readLine());
        linhaFormatada();
        
        System.out.println("\n========EXERCICIOS========\n");
        System.out.printf("Array: ");
         for(int i = 0; i<a.length;i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println("\n");
        linhaFormatada();
         
        //Ex01
        System.out.printf("A quantidade de valores maiores do que %d igual a %d \n", x, ContaValor(x,a,n));
        linhaFormatada();
        //Ex02
        System.out.printf("Soma de todos valores ate encontrar um valor menor que %d igual a %d \n", x, SomaArray(x, a, n));
        linhaFormatada();
        //Ex03
        System.out.printf("Calculando a quantidade de numeros pares no array igual a %d \n", ParArray(x, a, n));
        linhaFormatada();
        //Ex04
        System.out.printf("Multiplicando %d por 2 ate ultrapassar o maximo %d \n", x, max);
        linhaFormatada();
        MultiplicaMax(x, max);
        //Ex05
        System.out.printf("O menor valor dentro do array igual a %d \n", MenorNumero(x, a, n));
        linhaFormatada();
        //Ex06
        System.out.printf("Verificando se o valor %d esta presente no array: %s \n", x, EncontrarNumero(x, a, n));
        linhaFormatada();
        //Ex07
        System.out.printf("Calculando o fatorial de %d: %d\n", x, CalcularFatorial(x));
        linhaFormatada();
        //Ex08
        System.out.printf("A quantidade de valores maiores do que a media no array igual a %d \n", MaioresQueMedia(a, n));
        linhaFormatada();
        //Ex09
        System.out.printf("A quantidade de numeros divisiveis por %d no array igual a %d\n", x, ContaDivisoes(x, a, n));
        linhaFormatada();
        //Ex10
        System.out.printf("Retornando array invertido:\n");
        int[] invertido  = InverteArray(a, n);
        for(int i = 0; i<invertido.length;i++){
            System.out.printf("%d ", invertido[i]);
        }
        
    }
    
    public static int ContaValor(int x, int[] a, int n){
        int c = 0;
        for(int i=0;i<n;i++){
            if(a[i] > x){
                c+=1;
            }
        }
        return c;
    }
    
    public static int SomaArray(int x, int[] a, int n){
        int soma = 0;
        int i = 0;
        while(i<n && a[i]>x){
            soma+=a[i];
            i++;
        }
        return soma;
    }
    
    public static int ParArray(int x, int[] a, int n){
        int c = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2 == 0){
                c+=1;
            }
        }
        return c;
    }
    
    public static void MultiplicaMax(int x, int max){
        int cc = 0;
        while(x < max){
            x*= 2;
            cc++;
        }
        System.out.printf("-> Valor final: %d \n", x);
        System.out.printf("-> Quantidade de multiplicacoes realizadas: %d \n", cc);
    }
    
    public static int MenorNumero(int x, int[] a, int n){
        int menor = a[0];
        for(int i=0;i<n;i++){
            if(a[i] < menor){
                menor = a[i];
            }
        }
        return menor;
    }
    
    public static String EncontrarNumero(int x, int[] a, int n){
        boolean encontrado = false;
        for(int i=0;i<n;i++){
            if(a[i] == x){
                encontrado = true;
            }
        }
        
        return encontrado ? "Encontrado" : "Nao Encontrado";
    }
    
    public static int CalcularFatorial(int x){
        int resultado = 1;
        while(x>0){
            resultado*=x;
            x--;
        }
        return resultado;
    }
    
    public static int MaioresQueMedia(int[] a, int n){
        int cont = 0;
        int soma = 0;
        int qtd = 0;
        for(int i = 0; i < n; i++){
            soma+= a[i];
            qtd++;
        }
        int media;
        media = soma/qtd;
        for(int i = 0; i < n; i++){
            if(a[i] > media){
                cont++;
            }
        }
        return cont;
    }
    
    public static int ContaDivisoes(int x, int[] a, int n){
        int contagem = 0; 
        for(int i = 0; i<n; i++){
            if(a[i]%x == 0){
                contagem++;
            }
        }
        return contagem;
    }
    
    public static int[] InverteArray(int[] a, int n){
        int[] invertido = new int[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            invertido[j] = a[i];
            j++;
        }
        return invertido;
    }
    
    public static void linhaFormatada(){
        System.out.println("------------");
    }
}
