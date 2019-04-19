/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author caio_
 */
public class TestaComposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profissao prof = new Profissao();
        prof.setDescricao("Auxiliar Mecanico");
        prof.setInsalubre(true);
        
        Funcionario f = new Funcionario("Julio", 4500, prof);
        
    }
    
}
