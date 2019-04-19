
package br.com.fatec;


public class Aplicacao extends Investimento {

    public Aplicacao(Correntista correntista) {
        super(correntista);
    }
    
    @Override
    public void sacar(float valor)
    {
        if(getSaldo() > valor * 1.0038)
            setSaldo(getSaldo() - valor * 1.0038);
        else
            throw new RuntimeException(
                    "Saldo não comporta este saque");
    }
}
