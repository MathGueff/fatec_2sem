package EstruturaDados;

import java.util.HashMap;

/**
 *
 * @author Alunos
 */
public class Dicionario {
    private HashMap<String, String> palavras;
 
    public Dicionario() {
        this.palavras = new HashMap<>();
    }
 
    public void addPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }
 
    public String getDefinicao(String palavra) {
        return palavras.getOrDefault(palavra, "Definição não encontrada.");
    }
 
    public HashMap<String, String> getTodasPalavras() {
        return palavras;
    }
    
    public void removePalavra(String word){
        if(palavras.containsKey(word)){
            palavras.remove(word);
        }
        else{
            System.out.println("Definicao nao existente para essa palavra");
        }
    }
    
    public void atualizaDefinicao(String word, String newDefinition){
        if(palavras.containsKey(word)){
            palavras.remove(word);
            palavras.put(word, newDefinition);
        }
        else{
            System.out.println("Definicao nao existente para essa palavra");
        }
    }
    
    public int contaPalavras(){
        int counter = 0;
        for(String palavra : palavras.keySet()){
           counter++;
        }
        return counter;
    }
 
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
// 
//        // Adicionando algumas palavras e definições
//        dicionario.addPalavra("maçã", "Uma fruta.");
//        dicionario.addPalavra("cachorro", "Um animal domesticado pelo homem.");
//        dicionario.addPalavra("computador", "Um dispositivo eletrônico para processamento de dados.");
// 
//        // Recuperando a definição de uma palavra
//        String definicao = dicionario.getDefinicao("cachorro");
//        System.out.println("Definição de 'cachorro': " + definicao);
// 
//        // Listando todas as palavras no dicionário
//        System.out.println("Palavras no dicionário:");
//        for (String palavra : dicionario.getTodasPalavras().keySet()) {
//            System.out.println("- " + palavra);
//        }
// 
//        System.out.println("Significados das Palavras no dicionário:");
//        for (String palavra : dicionario.getTodasPalavras().values()) {
//            System.out.println("- " + palavra);
//        }
// 
//        System.out.println("Palavras e significados no dicionário:");
//        System.out.println(dicionario.getTodasPalavras());
        
        //Adicionando as definições
        dicionario.addPalavra("Frio", "substantivo masculino cuja temperatura e baixa; que expressa ou parece possuir uma temperatura mais baixa do que a corporal");
        dicionario.addPalavra("Calor", "Calor e por definicao transferencia de energia termica entre corpos que possuem temperaturas distintas");
        
        System.out.println("Definicoes das palavras adicionadas:");
        
        System.out.println(dicionario.getTodasPalavras());
        //Contagem 
        System.out.println("Quantidade de palavras: " +dicionario.contaPalavras());
        System.out.println("--------");
        
        //Removendo definições
        System.out.println("Tentando remover a definicao de uma palavra nao existente no dicionario");
        dicionario.removePalavra("Meio termo");
        System.out.println("--------");
        System.out.println("Removendo a definicao da palavra Calor");
        dicionario.removePalavra("Calor");
        
        System.out.println(dicionario.getTodasPalavras());
        //Contagem após remoção
        System.out.println("Quantidade de palavras: " +dicionario.contaPalavras());
        System.out.println("--------");
        
        //Atualizando definições
        System.out.println("Tentando atualizar a definicao de uma palavra que nao existe");
        dicionario.atualizaDefinicao("Meio termo", "O melhor de todos");
        
        System.out.println("--------");
        System.out.println("Atualizando a definicao da palavra frio");
        dicionario.atualizaDefinicao("Frio", "Frio e quando falta calor");
        
        System.out.println(dicionario.getTodasPalavras());
        System.out.println("Quantidade de palavras: " +dicionario.contaPalavras());
    }
}
