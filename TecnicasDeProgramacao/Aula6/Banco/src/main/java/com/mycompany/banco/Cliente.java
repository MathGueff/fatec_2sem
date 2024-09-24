/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

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
            this.id_cli = id_cli;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir um ID a conta deve estar aberta");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(isStatus()){
            this.nome = nome;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o nome a conta deve estar aberta");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(isStatus()){
            this.cpf = cpf;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o cpf a conta deve estar aberta");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(isStatus()){
            this.endereco = endereco;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o endereco a conta deve estar aberta");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
        if(isStatus()){
            this.uf = uf;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o uf a conta deve estar aberta");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
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
        if(isStatus()){
            this.email = email;
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
        if(isStatus()){
            this.telefone = telefone;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o telefone a conta deve estar aberta");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
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
            this.sexo = sexo;
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o sexo a conta deve estar aberta");
        }
    }
}
