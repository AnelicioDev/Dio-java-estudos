package interfaceExemplo;

public class ContaCorrente implements ContaBancaria{
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(int valor) {
        saldo += valor;
    }

    @Override
    public void sacar(int valor) {
        saldo -= valor;
    }

    @Override
    public int saldoDaConta() {
        return saldo;
    }
}
