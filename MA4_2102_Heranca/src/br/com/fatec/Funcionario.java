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
public class Funcionario {
    private String nome;
    private float salario;

    //construtores
    //public Funcionario() {
    //}

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    
    //Getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumento(float porc) {
        salario *= 1 + (porc / 100);
    }
    
    public float gratificacao() {
        return salario; //nao tem gratificacao
    }
    
}
