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
public class ContaCorrente {
    private String nome;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }
    
    /**
     * Este método não tem como especificar o motivo de não
     * ter efetuado o saque
     * @param valor
     * @return 
     */
    public boolean sacar(double valor) {
        // saldo insuficiente ou valor negativo (nao pode)
        if(valor > saldo || valor < 0)
            return false;
        else {
            saldo -= valor;
            return true;
        }
    }
    
    
    
    /**
     * Este método especifica o texto do motivo de não
     * ter efetuado o saque
     * @param valor
     * @return 
     */
    public boolean sacar_2(double valor) {
        // saldo insuficiente ou valor negativo (nao pode)
        if(valor > saldo)
            //lança uma excecao NÃO VERIFICADA
            throw new RuntimeException("Saldo Insuficiente");
        if(valor < 0)
            throw new RuntimeException("Valor de Saque negativo!!!");
        else {
            saldo -= valor;
            return true;
        }
    }
    
    /**
     * Este método especifica o texto do motivo de não
     * ter efetuado o saque
     * Força o uso do try..cath no main() devido ao throws
     * @param valor
     * @return 
     */
    public boolean sacar_3(double valor) throws Exception {
        // saldo insuficiente ou valor negativo (nao pode)
        if(valor > saldo)
            //lança uma excecao VERIFICADA
            throw new Exception("Saldo Insuficiente");
        if(valor < 0)
            throw new Exception("Valor de Saque negativo!!!");
        else {
            saldo -= valor;
            return true;
        }
    }
    
    /**
     * Este método especifica o texto do motivo de não
     * ter efetuado o saque
     * Força o uso do try..cath no main() devido ao throws
     * @param valor
     * @return 
     */
    public boolean sacar_4(double valor) 
                throws SaldoInsuficienteException, 
                       SaqueNegativoException {
        // saldo insuficiente ou valor negativo (nao pode)
        if(valor > saldo)
            //lança uma excecao VERIFICADA
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        if(valor < 0)
            throw new SaqueNegativoException();
        else {
            saldo -= valor;
            return true;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
