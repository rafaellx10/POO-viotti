/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.text.DecimalFormat;

/**
 *
 * @author fatecscs
 */
public class TestaExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cartao c1 = new Cartao();
        Cartao c2 = new Cartao();
        Cartao c3 = new Cartao();
        
        Compra cp1 = new Compra();
        Compra cp2 = new Compra();
        Compra cp3 = new Compra();
        Compra cp4 = new Compra();
        
        Cliente cli = new Cliente();
        
        //colocando dados
        c1.setBandeira("Master");
        c1.setLimite(5000);
        c1.setNumero("1234 8765 2342 9877");
        
        c2.setBandeira("Elo");
        c2.setLimite(1550);
        c2.setNumero("3753 6534 2352 9843");
        
        c3.setBandeira("Amex");
        c3.setLimite(3400);
        c3.setNumero("7634 3765 8873 2498");
        
        cp1.setDataCompa("10/03/2019");
        cp1.setValor(2500);
        
        cp2.setDataCompa("01/04/2019");
        cp2.setValor(1980);
        
        cp3.setDataCompa("01/03/2019");
        cp3.setValor(345);
        
        cp4.setDataCompa("10/03/2019");
        cp4.setValor(750);
        
        cli.adicionaCartao(c1);
        cli.adicionaCartao(c2);
        cli.adicionaCartao(c3);
        
        Cartao clonado = new Cartao();
        clonado.setNumero("1234 6543 3333 9876");
        
        //limpar os dados dos cartoes
        c1 = new Cartao();
        c3 = new Cartao();
        c1.setNumero("1234 8765 2342 9877");
        c3.setNumero("7634 3765 8873 2498");
                
        if(cli.comprar(cp1, clonado))
            System.out.println("Compra 1 Efetuada com sucesso");
        
        if(cli.comprar(cp2, c1))
            System.out.println("Compra 2 Efetuada com sucesso");
        
        if(cli.comprar(cp3, c3))
            System.out.println("Compra 3 Efetuada com sucesso");
        
        if(cli.comprar(cp4, c3))
            System.out.println("Compra 4 Efetuada com sucesso");
                    
        
        //lista todos os cartoes
        cli.listarCartoes();
        
        System.out.println("Compras ---------------------------");
        //lista todas as compras de cada cartao
        for(Cartao aux : cli.getCartoes()){
            System.out.println("Cartao: " + aux.getNumero());
            aux.listarCompras();
            System.out.println("-------------------------------------------");
        }
        
        //Calcula o total gasto em todos os cartoes
        double totalGeral=0;
        for(Cartao aux : cli.getCartoes()) {
            totalGeral += aux.somaCompra();
        }
        
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        System.out.println("Total Geral gasto: " + 
                df.format(totalGeral));
    }
    
}
