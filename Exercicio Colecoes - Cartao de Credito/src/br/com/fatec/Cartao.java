/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author fatecscs
 */
public class Cartao {
    private String numero, bandeira;
    private double limite;
    private Collection<Compra> compras = new ArrayList<>();
    
    public void listarCompras() {
        for(Compra aux : compras) {
            System.out.println("Data: " + aux.dataToString() +
                    "\t Valor: " + aux.valorToString() );
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cartao other = (Cartao) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    public boolean addCompra(Compra c) {
        if(limite < somaCompra() + c.getValor())
            return false;
        else {
            compras.add(c);
            return true;
        }
            
    }
    
    public double somaCompra() {
        double total=0;
        for(Compra aux : compras) {
            total += aux.getValor();
        }
        return total;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Collection<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Collection<Compra> compras) {
        this.compras = compras;
    }
    
    
    
    
}
