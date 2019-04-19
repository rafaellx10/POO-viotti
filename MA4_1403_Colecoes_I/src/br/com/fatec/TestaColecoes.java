/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author fatecscs
 */
public class TestaColecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection colecao_a = new ArrayList();
        //ArrayList colecao_b = new ArrayList();
        
        //Collection colecao_a = new HashSet();
        HashSet colecao_b = new HashSet();
        
        Qualquer q1 = new Qualquer(1, "Texto 1");
        Qualquer q2 = new Qualquer(2, "Texto 2");
        Qualquer q3 = new Qualquer(3, "Texto 3");
        
        Qualquer q4 = new Qualquer(4, "Texto 4");
        Qualquer q5 = new Qualquer(5, "Texto 5");
        Qualquer q6 = new Qualquer(6, "Texto 6");
        
        //Adicionando objetos nas colecoes
        colecao_a.add(q1);
        colecao_a.add(q2);
        colecao_a.add(q3);
        
        colecao_b.add(q4);
        colecao_b.add(q5);
        colecao_b.add(q6);
        
        //Exibindo os dados das coleçoes
        //usando o enhanced for
        System.out.println("Colecao A");
        for (Object obj : colecao_a) {
            System.out.println("Nome: " +
                    ((Qualquer)obj).getTexto());
        }
        
        //Via Iterador
        System.out.println("\nColecao B");
        Iterator it = colecao_b.iterator();
        Object obj;
        while (it.hasNext())
        {
            obj = it.next();
            System.out.println("Nome: " +
                    ((Qualquer)obj).getTexto());
        }
        
        //Usando um metodo que existe em colecao_b e nao existe
        //em colecao_a
        //System.out.println("Numero: " +
        //        ((Qualquer)colecao_b.get(1)).getNumero());
        
        long cont;
        Qualquer q;
        long start = System.currentTimeMillis();
        for(cont=0; cont<10000; cont++) {
            q = new Qualquer((int)cont, "Texto " + Long.toString(cont));
            colecao_a.add(q);
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo Total para ArrayList: "
                    + elapsed);
        
        start = System.currentTimeMillis();
        for(cont=0; cont<10000; cont++) {
            q = new Qualquer((int)cont, "Texto " + Long.toString(cont));
            colecao_b.add(q);
        }
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo Total para HashSet: "
                    + elapsed);
    }
    
}






