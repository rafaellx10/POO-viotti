/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author fatecscs
 */
public class Cliente {
    private String nome;
    private Collection<Cartao> cartoes = new HashSet<>();

    public void listarCartoes() {
        for(Cartao c : cartoes) {
            System.out.println("Cartao: " + c.getNumero());
        }
    }
    
    public boolean comprar(Compra compra, Cartao cartao){
        if(cartoes.contains(cartao)){
            return buscaCartao(cartao).addCompra(compra);
        } else
            return false;
    }
    
    private Cartao buscaCartao(Cartao c) {
        for(Cartao aux : cartoes){
            if(aux.equals(c))
                return aux;
        }
        return null;
    }
    
    public void adicionaCartao(Cartao c)
    {
        cartoes.add(c);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(Collection<Cartao> cartoes) {
        this.cartoes = cartoes;
    }
    
    
}
