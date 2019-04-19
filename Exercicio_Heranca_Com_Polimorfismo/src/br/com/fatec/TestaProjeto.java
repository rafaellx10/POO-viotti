
package br.com.fatec;

import javax.swing.JOptionPane;

public class TestaProjeto {

    public static void main(String[] args) {
        Correntista corr = new Correntista();
        corr.setNome("eu mesmo");
        corr.setCpf("12345");
        
        Normal normal = new Normal(corr);
        Especial especial = new Especial(4000, corr);
        Poupanca poupanca = new Poupanca(corr);
        
        normal.setSaldo(1200);
        normal.setNumero(1);
        
        especial.setNumero(2);
        especial.setSaldo(2400);
        
        poupanca.setNumero(3);
        poupanca.setSaldo(4800);
        
        //rendimento
        System.out.println("Saldo Poupanca: " + 
                poupanca.getSaldo());
        poupanca.rendimento(15);
        System.out.println("Saldo Poupanca + 15%: " + 
                poupanca.getSaldo());
        System.out.println("Sacar 6000 poupanca:");
        
        try {
            poupanca.sacar(6000);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
                
        System.out.println("Saldo Especial: " + 
                especial.getSaldo());
        especial.sacar(5000);
        System.out.println("Saldo Especial (-5000): " + 
                especial.getSaldo());
        
        System.out.println("Saldo Normal: " + 
                normal.getSaldo());
        
        try {
            normal.sacar(5000);
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog
                (null, ex.getMessage());
        }

        System.out.println("Saldo normal (-5000): " + 
                normal.getSaldo());
        
    }

}
