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
public class Gerente extends Funcionario {
    private String setor;
    private float adicional;

    //construtores
    public Gerente(String nome, float salario) {
        //chama o construtor da superclasse
        super(nome, salario);
    }
    
    //getter e setter
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
    
    //Métodos
    public float salarioAtual() {
        //o super busca da classe pai
        //o this busca da propria classe
        return super.getSalario() + this.getAdicional();
        
        //ou
        //return getSalario() + getAdicional();
    }
    
    //Sobrescrevendo um metodo
    @Override
    public float gratificacao() {
        //o f do valor indica um dados float e nao double
        return getSalario() * 1.15f;
    }
}
