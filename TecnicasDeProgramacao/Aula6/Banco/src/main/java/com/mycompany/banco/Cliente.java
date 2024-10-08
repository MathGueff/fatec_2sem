/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Cliente {
    
    private int id_cli;
    private String nome;
    private String cpf;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String email;
    private boolean status;
    private String telefone;
    private String cnpj;
    private char sexo;
    
    public Cliente(){
        this.status = true;
        //Construtor vazio para criação livre
    }

    public Cliente(int id_cli, String nome, String cpf, String endereco, String numero, String bairro, String cidade, String uf, String cep, String email, String telefone, String cnpj, char sexo) {
        this.id_cli = id_cli;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.sexo = sexo;
        this.status = true;
    }
    
    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        if(isStatus()){
            if(id_cli == 0){
                JOptionPane.showMessageDialog(null, "O id não pode ser 0");
            }
            else
            {
                this.id_cli = id_cli;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir um ID a conta deve estar aberta");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(nome.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Nome não pode ser branco");
            }
            else if(nome.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Nome não pode ser nulo");
            }
            else
            { 
                this.nome = nome;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o nome a conta deve estar aberta");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(cpf.isBlank())
            {
                JOptionPane.showMessageDialog(null, "CPF não pode ser em branco");
            }
            else if(cpf.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "CPF não pode ser nulo");
            }
            else
            {
                this.cpf = cpf;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o cpf a conta deve estar aberta");
        }
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        endereco = endereco.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(endereco.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Endereço não pode ser em branco");
            }
            else if(endereco.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Endereço não pode ser nulo");
            }
            else if(endereco.length() < 4)
            {
                JOptionPane.showMessageDialog(null, "Endereço deve ser maior");
            }
            else
            {
                this.endereco = endereco;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o endereco a conta deve estar aberta");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        numero = numero.trim();
        if(isStatus()){
            this.numero = numero;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o numero a conta deve estar aberta");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(isStatus()){
            this.bairro = bairro;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o bairro a conta deve estar aberta");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        cidade = cidade.trim();
        if(isStatus()){
            this.cidade = cidade;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir a cidade a conta deve estar aberta");
        }
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
        
        if(isStatus()){
            /*
                Validação do campo
            */
            if(uf.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Estado não pode ser branco");
            }
            else if(uf.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Estado não pode ser nulo");
            }
            else if(!estadosList.contains(uf))
            {
                JOptionPane.showMessageDialog(null, "Estado inválido");
            }
            else
            {
                this.uf = uf;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o uf a conta deve estar aberta");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        cep = cep.trim();
        if(isStatus()){
            this.cep = cep;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o cep a conta deve estar aberta");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email.trim();
        if(isStatus()){
            email = email.trim();
            /*
                Validação do campo
            */
            if(email.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Email não pode ser em branco");
            }
            else if(email.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Email não pode ser nulo");
            }
            else if(email.contains("@") && email.contains(".") && email.length() >= 5) //a@b.c
            {
                this.email = email;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Email inválido");
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o email a conta deve estar aberta");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        telefone = telefone.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(telefone.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Telefone não pode ser em branco");
            }
            else if(telefone.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Telefone não pode ser nulo");
            }
            else if(telefone.length() != 13)
            {
                JOptionPane.showMessageDialog(null, "Tamanho de telefone inválido");
            }
            else
            { 
                this.telefone = telefone;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o telefone a conta deve estar aberta");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        cnpj = cnpj.trim();
        if(isStatus()){
            this.cnpj = cnpj;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o cnpj a conta deve estar aberta");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(isStatus()){
            if(sexo == 'F' || sexo == 'M')
            {
                this.sexo = sexo;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sexo inválido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o sexo a conta deve estar aberta");
        }
    }
}
