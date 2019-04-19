
package br.com.fatec;


public class Especial extends Corrente {
    private double limite;
    private CCredito ccredito;

    public Especial(double limite, Correntista correntista) {
        super(correntista);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if(getSaldo() + limite >= valor)
            setSaldo(getSaldo() - valor);
        else
            throw new RuntimeException("Saldo Insuficiente (especial)");
    }

    public CCredito getCcredito() {
        return ccredito;
    }

    public void setCcredito(CCredito ccredito) {
        this.ccredito = ccredito;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
