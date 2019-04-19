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
    
    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade(int idade) throws Exception {
        if(idade < 0) {
            throw new Exception("erro idade");
            //return; // nao faz nada e vai embora
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
