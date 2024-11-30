/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Random;

/**
 *
 * @author Alunos
 */
public class PilhaEx06<T> {
    private No<T> top; //Guarda o topo da pilha (ultimo nó)
    
    private static class No<T>{
        T data;
        No<T> next;
        
        public No(T data){
            this.data = data;
        }
    }
    
    public void push(T item){
        No<T> newNode = new No<>(item);
        newNode.next = top;
        top = newNode;
    }
    
    public T pop(){
        if(isEmpty()){
            System.out.println("A pilha esta vazia");
            return null;
        }
        T poppedItem = top.data;
        top = top.next;
        return poppedItem;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public T peek(){
        if(isEmpty()){
            System.out.println("Pilha esta vazia");
            return null;
        }
        return top.data;
    }
    
    public void clear(){
        while(!isEmpty()){
            pop();
        }
    }
    
    public int size(){
        if(top != null){
            No<T> tempTop = top;
            int size = 1;
            while(tempTop.next != null){
                size++;
                tempTop = tempTop.next;
            }
            return size;
        }
        else{
            return 0;
        }
    }
    
    public void list(){
        if(top != null){
            No<T> tempTop = top;
            for(int i = 0; i < size(); i++){
                if(tempTop != null){
                    System.out.print(tempTop.data + " ");
                    tempTop = tempTop.next;
                }
            }
        }
        else{
            System.out.println("A pilha esta vazia");
        }
    }
    
    public static void main(String[] args) {
        PilhaEx06<Integer> pilha = new PilhaEx06<>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Removendo o topo: " + pilha.pop());
        System.out.println(pilha.isEmpty() ? "Pilha e vazia" : "Pilha nao e vazia");
        pilha.clear();
        System.out.println(pilha.isEmpty() ? "Pilha e vazia" : "Pilha nao e vazia");
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Tamanho da pilha : " + pilha.size());
        pilha.push(10);
        pilha.push(15);
        pilha.push(35);
        pilha.push(55);
        System.out.println("Tamanho da pilha (apos adicionar elementos) : " + pilha.size());
        System.out.print("Elementos da pilha: ");
        pilha.list();
        pilha.clear();
        pilha.push(5);
        pilha.push(15);
        pilha.push(25);
        pilha.push(35);
        pilha.push(45);
        
        System.out.print("\nValores da lista -> ");
        pilha.list();
        
        int soma = 0;
        int cont = 0;
        int media = 0;
        
        while(!pilha.isEmpty()){
            int popped = pilha.pop();
            soma+= popped;
            cont++;
        }
        System.out.println("\nQuantidade de numeros na pilha -> " + cont);
        System.out.println("Soma dos valores -> " + soma);
        media = soma/cont;
        System.out.println("Media -> " + media);
    }
}
