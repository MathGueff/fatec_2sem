/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author Alunos
 */
public class TesteListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionarNoMeio(15, 1);
        System.out.println("---Listando os nos adicionados a lista com adicionar() e adicionarNoMeio()---");
        lista.listarLista();
        
        System.out.println("\nRemovendo o primeiro no com remover()");
        lista.remover();
        
        lista.listarLista();
        
        System.out.println("\nAdicionando dois nos e inserindo o no com valor 100 na posicao 3 (2)");
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionarNoMeio(100, 2);
        lista.listarLista();
        
        System.out.println("\nA lista"+ (lista.ehVazia() ? " " : " nao") + " esta vazia");
        
        System.out.println("\nEsvaziando a lista: ");
        lista.esvaziarLista();
        System.out.println("\nA lista"+ (lista.ehVazia() ? "" : " nao") + " esta vazia");
        
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        
        System.out.println("\n---Buscando---");
        int valor = 30;
        System.out.println("O valor " + valor + " esta na posicao: " + lista.buscar(valor));
        lista.listarLista();
        
        System.out.println("\n---Removendo ultimo---");
        lista.listarLista(); //Lista original
        lista.removerUltimo();
        lista.listarLista(); //Ultimo removido
        
        System.out.println("\n---Recebendo o tamanho---");
        lista.listarLista();
        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}
