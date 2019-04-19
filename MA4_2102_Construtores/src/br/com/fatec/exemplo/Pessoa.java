/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exemplo;

/**
 *
 * @author aluno
 */
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    
    //construtores
    
    //construtor default
    public Pessoa() {
        System.out.println("Criando uma pessoa");
        nome = "";
    }
    
    //construtor parametrico
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade(int idade) {
        if(idade < 0) {
            return; // nao faz nada e vai embora
        }
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    
    //Metodos
    public void aniversario() {
        idade++; //soma 1 na idade
    }
}
