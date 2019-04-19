/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.Exceptions;

/**
 *
 * @author fatecscs
 */
public class SaqueNegativoException extends Exception {
    
    public SaqueNegativoException() {
        // chama o construtor da super classe
        //super();
        //ou gera uma mensagem de erro padronizada
        this("O valor do do saque não pode ser negativo");
    }
    
    public SaqueNegativoException(String msg) {
        super(msg);
    }
    
}
