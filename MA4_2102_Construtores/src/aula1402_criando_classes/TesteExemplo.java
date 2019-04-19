/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1402_criando_classes;

import br.com.fatec.exemplo.Pessoa;

/**
 *
 * @author aluno
 */
public class TesteExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        
        Pessoa p2 = new Pessoa("Viotti");
        System.out.println("P2 Nome: " + p2.getNome());
        System.out.println("P2 Idade: " + p2.getIdade());
        
        
    }
    
}
