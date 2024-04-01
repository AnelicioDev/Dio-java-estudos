package Hranca.Entities;

public class Poupanca extends Conta{
    private double taxaDeJurus;

    public Poupanca(int numero, String nome, double saldoDaConta, double taxaDeJurus) {
        super(numero, nome, saldoDaConta);
        this.taxaDeJurus = taxaDeJurus;
    }
    public double getTaxaDeJurus() {
        return taxaDeJurus;
    }

    public void setTaxaDeJurus(double taxaDeJurus) {
        this.taxaDeJurus = taxaDeJurus;
    }
    public void atualizaSaldo(){
        saldoDaConta += saldoDaConta * taxaDeJurus;
    }
}
