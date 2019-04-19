/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author fatecscs
 */
public class Pai {
    private String nome;
    private ArrayList<Filho> filhos = new ArrayList<>();

    //Metodo para adicionar um filho
    public void addFilho(Filho f) {
        filhos.add(f);
    }
    
    public void removeFilho(Filho f) {
        filhos.remove(f);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Filho> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Filho> filhos) {
        this.filhos = filhos;
    }
    
    
}
