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
    private float adicional;
    //Agregacao
    private Setor setor;

    //construtores
    public Gerente(String nome, float salario) {
        //chama o construtor da superclasse
        super(nome, salario);
        //Cria o objeto setor para ser utilizado na 2ª maneira
        //de criação de agregacao
        setor = new Setor(""); //como nao sei o setor, vou colocar
        // vazio para ele
    }
    
    //getter e setter   
    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
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
