/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Agencia {
    private String num_agencia;
    private String nome;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String cnpj;
    private String gerente;
    
    public Agencia(){
        //Construtor vazio para o objeto Agencia
    }

    public Agencia(String num_agencia, String nome, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String cnpj, String gerente) {
        this.num_agencia = num_agencia;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.cnpj = cnpj;
        this.gerente = gerente;
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        if(num_agencia.isBlank() || num_agencia.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Digite o número da agência");
        }
        else{
            this.num_agencia = num_agencia;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
         if(nome.isBlank() || nome.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Digite seu nome");
        }
        else{
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
         if(endereco.isBlank() || endereco.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Digite o endereço");
        }
        else{
            this.endereco = endereco;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        uf = uf.trim();
        uf = uf.toUpperCase();
        String[] estados = {
            "AC", // Acre
            "AL", // Alagoas
            "AP", // Amapá
            "AM", // Amazonas
            "BA", // Bahia
            "CE", // Ceará
            "DF", // Distrito Federal
            "ES", // Espírito Santo
            "GO", // Goiás
            "MA", // Maranhão
            "MT", // Mato Grosso
            "MS", // Mato Grosso do Sul
            "MG", // Minas Gerais
            "PA", // Pará
            "PB", // Paraíba
            "PR", // Paraná
            "PE", // Pernambuco
            "PI", // Piauí
            "RJ", // Rio de Janeiro
            "RN", // Rio Grande do Norte
            "RS", // Rio Grande do Sul
            "RO", // Rondônia
            "RR", // Roraima
            "SC", // Santa Catarina
            "SP", // São Paulo
            "SE", // Sergipe
            "TO"  // Tocantins
        };
        
        List<String> estadosList = Arrays.asList(estados);
        
        /*
            Validação do campo
        */
        if(uf.isBlank() || uf.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Escolha um estado");
        }
        else if(!estadosList.contains(uf))
        {
            JOptionPane.showMessageDialog(null, "Estado inválido");
        }
        else
        {
            this.uf = uf;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep.isEmpty() || cep.isBlank()){
            JOptionPane.showMessageDialog(null,"Digite o CEP");
        }
        else{
            this.cep = cep;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj.isEmpty() || cnpj.isBlank()){
            JOptionPane.showMessageDialog(null,"Digite o CNPJ");
        }
        else{
            this.cnpj = cnpj;
        }
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}
