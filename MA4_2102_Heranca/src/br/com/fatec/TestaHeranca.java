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
public class TestaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente g = new Gerente("Edcarlos", 5600);
        
        //atribuindo dados
        //g.setNome("Edcarlos");  foi passado pelo construtor
        //g.setSalario(5600);     foi passado pelo construtor
        g.setSetor("Informática");
        g.setAdicional(200);
        
        //dar um aumento
        g.aumento(10);
        
        //exibir dados
        System.out.println("Nome: " + g.getNome());
        System.out.println("Salario Atual: " + g.salarioAtual());
        
        System.out.println("Gratificacao: " + g.gratificacao());
    }
    
}
