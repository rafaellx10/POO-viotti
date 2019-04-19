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
public class AULA1402_CRIANDO_CLASSES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Criar um objeto
        //importar classe pessoa do pacote br.com.fatec.exemplo.Pessoa 
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.setNome("Joao Pedro");
        p1.setIdade(45);
        
        p2.setNome("Carla Santos");
        p2.setIdade(22);
        
        //Exibindo Dados
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        
        //Invocando um evento para p1
        p1.aniversario();
        System.out.println("Pós Aniversario: " + p1.getIdade());
        
        
        
    }
    
}
