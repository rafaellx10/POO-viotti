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
public class SaldoInsuficienteException  extends Exception {
    
    public SaldoInsuficienteException() {
        // chama o construtor da super classe
        //super();
        //ou gera uma mensagem de erro padronizada
        this("O saque não pode ser realizado, por insuficiencia de saldo");
    }
    
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
    
}
