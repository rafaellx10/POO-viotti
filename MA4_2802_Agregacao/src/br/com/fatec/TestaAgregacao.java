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
public class TestaAgregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente g = new Gerente("Edcarlos", 5600);
        
        //1ª maneira de colocar um setor no gerente
        Setor s = new Setor("Almoxarifado");
        g.setSetor(s);
        //colocar o numero de funcionarios no setor
        g.getSetor().setQtdFunc(15);
        System.out.println("Gerente:" + g.getNome());
        s.setDescricao("Compras");
        System.out.println("Setor:" + g.getSetor().getDescricao());
        System.out.println("Gratificação:" + g.gratificacao());
        
        //2ª maneira de colocar um setor no gerente
        Gerente ger = new Gerente("Sonia", 4500);
        ger.getSetor().setDescricao("Distribuição");
        ger.getSetor().setQtdFunc(6);
    }
    
}
