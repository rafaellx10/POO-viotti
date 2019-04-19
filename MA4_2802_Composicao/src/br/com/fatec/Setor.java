/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author fatecscs
 */
public class Setor {
    private String descricao;
    private int qtdFunc;
    
    //Construtores
    public Setor(String descricao) {    
        this.descricao = descricao;
    }

    //Getters e Setter
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdFunc() {
        return qtdFunc;
    }

    public void setQtdFunc(int qtdFunc) {
        this.qtdFunc = qtdFunc;
    }
    
}
