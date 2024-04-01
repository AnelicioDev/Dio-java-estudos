package Hranca.Entities;

public class Conta {
    private int numero;
    private String nome;
    protected double saldoDaConta;

    public Conta(int numero, String nome, double saldoDaConta) {
        this.numero = numero;
        this.nome = nome;
        this.saldoDaConta = saldoDaConta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }
    public void sacar(double valor){
        saldoDaConta -= valor;
    }
    public void depositar(double valor){
        saldoDaConta += valor;
    }
}
