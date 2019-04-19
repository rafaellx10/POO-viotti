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
public class TestaWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer  numero = new Integer("5");
        System.out.println("O numero vale: " + numero);
        
        int valor = 7;
        
        numero = numero + valor;
        //ou
        System.out.println("O numero vale: " + numero);
        //Armazenado em uma colecao
        ArrayList c = new ArrayList();
        
        //nao da para adicionar um tipo primitivo
        c.add(valor);
        
        System.out.println("Valor da colecao: " + c.get(0));
        
        String qualquer;
        qualquer = numero.toString(); //converte Integer para String 
        //converte um tipo int em String
        qualquer = Integer.toString(valor); 
        
        //para converter uma String em int
        valor = Integer.parseInt(qualquer);
    }
    
}
