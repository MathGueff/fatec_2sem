/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Usuario {
    private String senha;
    private int id_usuario;
    private int num_agencia;
    private int num_cc;
    
    public Usuario(String senha,int id_usuario, int num_agencia, int num_cc){
        this.senha = senha;
        this.id_usuario = id_usuario;
        this.num_agencia = num_agencia;
        this.num_cc = num_cc;
    }
    
    public Usuario(){}

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        senha = senha.trim();
        if(senha.isBlank() || senha.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite uma senha válida");
        }
        else if(senha.length() < 10){
            JOptionPane.showMessageDialog(null, "A senha deve ter pelo menos 10 caracteres");
        }
        else{
            this.senha = senha;
        }
    }

    public int getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(int id_usuario) {
        if(id_usuario == 0){
            JOptionPane.showMessageDialog(null, "Digite um número de usuário válido");
        }
        else{
            this.id_usuario = id_usuario;
        }
    }

    public int getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(int num_agencia) {
        if(num_agencia == 0){
            JOptionPane.showMessageDialog(null, "Digite um número da agência válido");
        }
        else{
            this.num_agencia = num_agencia;
        }
    }
    
    public int getNum_cc() {
        return num_cc;
    }

    public void setNum_cc(int num_cc) {
        if(num_cc <= 0){
            JOptionPane.showMessageDialog(null, "Digite um número de conta corrente válida");
        }
        else{
            this.num_cc = num_cc;
        }
    }
    
    public String dadosSQLValues(){
        String dadosContaCorrente;
        dadosContaCorrente = 
            getSqlValue(getSenha()) + "," +
            getSqlValue(Integer.toString(getNum_agencia())) + "," +
            getSqlValue(Integer.toString(getNum_cc()));   
        return dadosContaCorrente;        
    }
    
    // Função auxiliar para verificar se o valor é nulo ou vazio
    private String getSqlValue(String value) {
        String campo = (value == null || value.isEmpty()) ? "NULL" : "'" + value + "'";
        return campo;
    }
}
