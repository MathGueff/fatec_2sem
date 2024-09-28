/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
 *
 * @author Alunos
 */
public class Cidade {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList();
        cidades.add("São Paulo");
        cidades.add("Uratuba");
        cidades.add("Caraguatatuba");
        System.out.println(cidades);
        Collections.sort(cidades);
        System.out.println(cidades);
    }
}
