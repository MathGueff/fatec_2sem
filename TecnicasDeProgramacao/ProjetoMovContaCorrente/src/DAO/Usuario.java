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
    private String login;
    private String senha;
    private int id_cli;
    private int num_agencia;
    
    public Usuario(String login, String senha,int id_cli, int num_agencia){
        this.login = login;
        this.senha = senha;
        this.id_cli = id_cli;
        this.num_agencia = num_agencia;
    }
    
    public Usuario(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        login = login.trim();
        if(login.isBlank() || login.isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o login");
        }
        else{
            this.login = login;
        }
    }

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

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        if(id_cli == 0){
            JOptionPane.showMessageDialog(null, "Digite um número de cliente válido");
        }
        else{
            this.id_cli = id_cli;
        }
    }

    public int getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(int num_agencia) {
        if(num_agencia == 0){
            JOptionPane.showMessageDialog(null, "Digite um número da agência inválido");
        }
        else{
            this.num_agencia = num_agencia;
        }
    }
}
