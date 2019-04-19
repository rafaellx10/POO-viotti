/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import br.com.fatec.Exceptions.SaldoInsuficienteException;
import br.com.fatec.Exceptions.SaqueNegativoException;

/**
 *
 * @author fatecscs
 */
public class TestaExcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente cc = new ContaCorrente();
        
        cc.depositar(1000);
        
        System.out.println("Sem exceção");
        //Sem o uso de exceções
        if(cc.sacar(-1500))
            System.out.println("Saque efetuado com sucesso");
        else
            System.out.println("Ocorreu algum problema");
        
        
        System.out.println("Com exceção VEFIFICADA");
        
        try {
            //Com o uso de exceções VERIFICADAS
            // portando o java OBRIGA o uso do try..catch
            if(cc.sacar_3(-1500))
                System.out.println("Saque efetuado com sucesso");
            else
                System.out.println("Ocorreu algum problema");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    
        System.out.println("Com exceção VEFIFICADA Criada por nós");
        
        try {
            //Com o uso de exceções VERIFICADAS
            // portando o java OBRIGA o uso do try..catch
            if(cc.sacar_4(-1500))
                System.out.println("Saque efetuado com sucesso");
            else
                System.out.println("Ocorreu algum problema");
        } catch (SaldoInsuficienteException | SaqueNegativoException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } //catch (SaqueNegativoException ex) {
//            System.out.println("Erro: " + ex.getMessage());
//        }
        System.out.println("Com exceção NAO VEFIFICADA");
        
        //try {
            //Com o uso de exceções NÃO VERIFICADAS
            // portando o java não obriga o uso do try..catch
            if(cc.sacar_2(1500))
                System.out.println("Saque efetuado com sucesso");
            else
                System.out.println("Ocorreu algum problema");
        //} catch (RuntimeException ex) {
        //    System.out.println("Erro: " + ex.getMessage());
        //}
    }    
        
        
    
}
