
package br.com.fatec;


public abstract class Investimento extends Conta {

    public Investimento(Correntista correntista) {
        super(correntista);
    }
    
    public void rendimento(float porcentagem) {
        setSaldo(getSaldo() * (1+porcentagem/100));
    }
}
