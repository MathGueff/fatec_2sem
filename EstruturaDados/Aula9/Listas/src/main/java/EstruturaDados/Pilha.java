/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Stack;

/**
 *
 * @author Alunos
 */
public class Pilha {
    static Stack<String> pilha;
    
    public static void main(String[] args) {
        pilha = new Stack<>();
        pilha.push("Primeiro elemento");
        pilha.push("Segundo elemento");
        pilha.push("Terceiro elemento");
        
        System.out.println("Tamanho da pilha " + pilha.size());
        String elementoTopo = pilha.peek();
        System.out.println("Elemento do topo " + elementoTopo);
        imprimir();
        String elementoRemovido = pilha.pop();
        System.out.println("Elemento removido " + elementoRemovido);
        System.out.println("Novo tamanho da pilha " + pilha.size());
        imprimir();
    }
    
    static void imprimir(){
        System.out.println("===ELEMENTOS DA PILHA===");
        for(String e : pilha){
            System.out.println(e);
        }
    }
}
