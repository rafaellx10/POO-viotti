package br.com.fatec;

public abstract class Conta {

    private Correntista correntista;
    private int numero;
    private double saldo;

    public Conta(Correntista correntista) {
        this.correntista = correntista;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        if(saldo >= valor) {
            saldo -= valor;
        } else {
            throw new RuntimeException("Saldo Insuficiente");
        }
    }
    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
