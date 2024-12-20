/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.LinkedList;

/* Implemente uma classe chamada ListaLigada que utilize a classe LinkedList que terá os seguintes métodos:
- adicionar(int value): Adiciona um novo nó com o valor especificado ao final da lista.
- remover(): Remove o primeiro nó da lista.
- ehVazia(): Verifica se a lista está vazia.
- listarLista(): Exibe os valores de todos os nós da lista encadeada.
 */

public class ListaLigada {
    LinkedList<No> lista = null;
    
    public ListaLigada(){
        lista = new LinkedList<>();
    }
    
    protected void adicionar(int n){
        No no = new No(n, null); 
        lista.add(no); 
        if(lista.size() > 1){
            No na = lista.get(lista.size() - 2); //Pega nó anterior ao atual criado
            na.setProxNo(no);  //Seta o atributo ProxNo do anterior como o nó criado
            lista.set(lista.size() - 2,  na);  //Atualiza a lista com o objeto na
        }
    }
    
    protected Object remover(){
        return lista.pop();
    }
    
    protected boolean ehVazia(){
        return lista.isEmpty();
    }
    
    protected void listarLista() {
        for (No no : lista) {
            System.out.print("[ " + no.getNum() + " ]");
            if (no.getProxNo() != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("");
    }
    
    protected void adicionarNoMeio(int n, int posicao){
        if(posicao > 0 && posicao <= lista.size()){
            No no = new No(n,null);
            if(posicao == 0){
                no.setProxNo(lista.get(0)); //Atribui como proxNo o nó que antes era o primeiro
                lista.add(0,no); 
            }
            else if(posicao == lista.size()){
                adicionar(n); //Somente adiciona, já que é o último elemento
            }
            else{
                No anterior = lista.get(posicao - 1); //Pega o nó anterior baseado na posição que queremos
                No proximo = anterior.getProxNo(); //Pega o proximo nó baseado no proxNo do antigo na posição
                anterior.setProxNo(no); // O nó anterior agora tem como proxNo o nó que inserimos
                no.setProxNo(proximo); //O nó que inserimos atribui como proxNo o proxNo do anterior
                lista.add(posicao, no); //Adicionamos à lista
            }
        }
        else{
            System.out.println("Posição inválida");
        }
    }
    
    protected void esvaziarLista(){
        while(!this.ehVazia()){
            this.remover();
        }
    }
    
    protected int buscar(int n){
        int posicao = 0;
        for(No no : lista){
            if(no.getNum() == n){
                return posicao;
            }
            posicao += 1;
        }
        return -1;
    }
    
    protected int tamanho(){
        return lista.size();
    }
    
    protected void removerUltimo(){
        lista.removeLast();
        No na = lista.getLast();
        na.setProxNo(null);
    }
}
