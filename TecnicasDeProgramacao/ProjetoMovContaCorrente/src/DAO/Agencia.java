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
    private String telefone;
    
    public Agencia(){
        //Construtor vazio para o objeto Agencia
    }

    public Agencia(String num_agencia, String nome, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String telefone) {
        this.num_agencia = num_agencia;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(String num_agencia) {
        num_agencia = num_agencia.trim();
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
        nome = nome.trim();
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
        endereco = endereco.trim();
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
        numero = numero.trim();
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        complemento = complemento.trim();
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        bairro = bairro.trim();
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        cidade = cidade.trim();
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        uf = uf.trim();
        uf = uf.toUpperCase();
        /*
            Validação do campo
        */
        if(uf.isBlank() || uf.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Escolha um estado");
        }
        else if(AtrValidator.isUf(uf))
        {
            this.uf = uf;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Estado inválido");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        cep = cep.trim();
        if(cep.isEmpty() || cep.isBlank()){
            JOptionPane.showMessageDialog(null,"Digite o CEP");
        }
        else{
            this.cep = cep;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        telefone = telefone.trim();
        if(telefone.isBlank() || telefone.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o telefone");
        }
        else if(telefone.length() == 11){
            this.telefone = telefone;
        }
        else{
            JOptionPane.showMessageDialog(null, "Digite um telefone válido");
        }
        this.telefone = telefone;
    }
    
    public String dadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = 
            getSqlValue(this.getNome()) + "," +
            getSqlValue(this.getEndereco()) + "," +
            getSqlValue(this.getNumero()) + "," +
            getSqlValue(this.getComplemento()) + "," +
            getSqlValue(this.getBairro()) + "," +
            getSqlValue(this.getCidade()) + "," +
            getSqlValue(this.getUf()) + "," +
            getSqlValue(this.getCep()) + "," +
            getSqlValue(this.getTelefone());
        return dadosAgencia;        
    }
    
    // Função auxiliar para verificar se o valor é nulo ou vazio
    private String getSqlValue(String value) {
        String campo = (value == null || value.isEmpty()) ? "NULL" : "'" + value + "'";
        return campo;
    }
}
