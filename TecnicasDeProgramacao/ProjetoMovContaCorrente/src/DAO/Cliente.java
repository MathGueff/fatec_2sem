/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Validator.AtrValidator;
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
    private String complemento;
    private String DataNascimento;
    
    public Cliente(){
        this.status = true;
        //Construtor vazio para criação livre
    }

    public Cliente(int id_cli, String nome, String cpf, String endereco, String numero, String bairro, String cidade, String uf, String cep, String email, String telefone, String cnpj, char sexo, String dataNascimento, String complemento) {
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
        this.DataNascimento = dataNascimento;
        this.complemento = complemento;
    }
    
    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        if(isStatus()){
            if(id_cli <= 0){
                JOptionPane.showMessageDialog(null, "Digite um ID válido");
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
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        complemento = complemento.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(!complemento.isBlank() && !complemento.isEmpty())
            {
                this.complemento = complemento;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o complemento a conta deve estar aberta");
        }
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        DataNascimento = DataNascimento.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(!DataNascimento.isBlank() && !DataNascimento.isEmpty())
            {
                this.DataNascimento = DataNascimento;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o nome a conta deve estar aberta");
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
            if(nome.isBlank() || nome.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Digite seu nome");
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        endereco = endereco.trim();
        if(isStatus()){
            /*
                Validação do campo
            */
            if(endereco.isBlank() || endereco.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Digite seu endereço");
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
            /*
                Validação do campo
            */
            if(!numero.isBlank() && !numero.isEmpty())
            {
                this.numero = numero;
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o número a conta deve estar aberta");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(isStatus()){
            /*
                Validação do campo
            */
            if(!bairro.isBlank() && !bairro.isEmpty())
            {
                this.bairro = bairro;
            }
            /*
                Fim da validação do campo
            */
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
        
        if(isStatus()){
            /*
                Validação do campo
            */
            if(uf.isBlank() || uf.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Escolha um Estado");
            }
            else if(AtrValidator.isUf(uf))
            {
                this.uf = uf;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Estado inválido");
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
            if(cep.isBlank() || cep.isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite seu CEP");
            }
            else{
                this.cep = cep;
            }
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
            if(email.isBlank() || email.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Digite seu email");
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
            if(!telefone.isBlank() && !telefone.isEmpty())
            {
                if(telefone.length() != 11)
                {
                    JOptionPane.showMessageDialog(null, "Tamanho de telefone inválido");
                }
                else{
                    this.telefone = telefone;
                }
            }
            /*
                Fim da validação do campo
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o telefone a conta deve estar aberta");
        }
    }
    
      public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf.trim();
        if(isStatus()){
            if(!cpf.isBlank() && !cpf.isEmpty()){
               if(AtrValidator.isCPF(cpf)){
                    this.cpf = cpf;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite um CPF válido");
                } 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o CPF a conta deve estar aberta");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        cnpj = cnpj.trim();
        if(isStatus()){
            if(!cnpj.isBlank() && !cnpj.isEmpty()){
               if(AtrValidator.isCNPJ(cnpj)){
                    this.cnpj = cnpj;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite um CNPJ válido");
                } 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Para definir o CNPJ a conta deve estar aberta");
        }
    }
    
    public String dadosSQLValues(){
    String dadosClientes;
    dadosClientes = 
        getSqlValue(this.getNome()) + "," +
        getSqlValue(this.getEndereco()) + "," +
        getSqlValue(this.getNumero()) + "," +
        getSqlValue(this.getComplemento()) + "," +
        getSqlValue(this.getBairro()) + "," +
        getSqlValue(this.getCidade()) + "," +
        getSqlValue(this.getUf()) + "," +
        getSqlValue(this.getCep()) + "," +
        getSqlValue(this.getTelefone()) + "," +
        getSqlValue(this.getCpf()) + "," +
        getSqlValue(this.getDataNascimento()) + "," +
        getSqlValue(this.getCnpj());
        return dadosClientes;
    }
    
    // Função auxiliar para verificar se o valor é nulo ou vazio
    private String getSqlValue(String value) {
        String campo = (value == null || value.isEmpty()) ? "NULL" : "'" + value + "'";
        return campo;
    }
}
