/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatecscs
 */
public class Compra {
    private Date data = new Date();
    private float valor;
    private SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
    private DecimalFormat df = new DecimalFormat("###,###,###.00");

    public void setDataCompa(String data) {
        
        try { 
            this.data = sdf.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String valorToString() {
        return df.format(valor);
    }
    
    public String dataToString() {
        return sdf.format(data);
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    
}
