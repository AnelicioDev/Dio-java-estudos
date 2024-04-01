package Heranca.Entities;

public class ContaDeNegocio extends Conta{
    private double limiteEmprestimo;

    public ContaDeNegocio(int numero, String nome, double saldoDaConta, double limiteEmprestimo) {
        super(numero, nome, saldoDaConta);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
     public void empretimo(double valor){
        if(valor <= limiteEmprestimo){
           saldoDaConta += valor - 10.0;
        }

     }
}
