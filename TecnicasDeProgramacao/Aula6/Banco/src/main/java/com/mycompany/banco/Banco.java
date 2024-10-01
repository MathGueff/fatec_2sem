
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Banco {

    public static void main(String[] args) {
        //Agencia b = new Agencia("12","Nome","Endereco","Numero", "Complemento","bairro","cidade", "","","","Gerente");
        //b.setNum_agencia(null);
        //b.setNome(null);
        //b.setEndereco(null);
        //System.out.println("TESTE: " + b.getNum_agencia());
        
        //Historico h = new Historico(0, "historico");
        //h.setId_his(0);
        
        Cliente cli = new Cliente(0, "nome", "0", "endereco", "numero", "bairro", "cidade", "0", "0", "email", "telefone", "0", '0');
        //cli.setId_cli(1);
        //System.out.println(cli.getId_cli());
        //cli.setStatus(false);
        //cli.setNome("aaaa");
        //cli.setCidade("Cidae");
        //cli.setStatus(true);
        //cli.setNome("Nicolas");
        //cli.setEndereco("");
        //cli.setEmail("a@b.c");
        //System.out.println(cli.getEmail());
        //cli.setEmail("           @.    ");
        //System.out.println(cli.getEmail());
        //cli.setSexo('T');
        //cli.setUf("100");
        //System.out.println(cli.getNome());
        
        //ContaCorrente cc = new ContaCorrente("num_conta", "num_agencia", 0, 0);
        //cc.setNum_agencia(null);
        //cc.setNum_conta(null);
        //cc.setId_cli(0);
        
        //Movimentacao m = new Movimentacao("num_conta", "num_age", "documento", "data_mov", "creditoDebito", 0, "compl_hist", 0, 0);
        //m.setCreditoDebito(null);
        //m.setData_mov(null);
        //m.setId_his(0);
        //m.setValor(0);
        //m.setSaldo(0);
        //m.setNum_age(null);
        //m.setNum_conta(null);
        
        //Usuario u = new Usuario("a", "111", 0, 0);
        //u.setNum_agencia(0);
        //u.setLogin(null);
        //u.setSenha(null);
        //u.setId_cli(0);
    }
}

