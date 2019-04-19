/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author fatecscs
 */
public class TestaProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Filho f1 = new Filho();
        Filho f2 = new Filho();
        
        Pai p = new Pai();
        
        //adiciona o filho no pai
        p.addFilho(f1);
        p.addFilho(f2);
        
        //listar os filhos
        for(Filho aux : p.getFilhos()) {
            System.out.println("Nome Filho: " + aux.getNome());
        }
    }
   
}
