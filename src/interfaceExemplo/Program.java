package interfaceExemplo;

public class Program {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1250);
        contaCorrente.sacar(250);

        System.out.println("Slado da conta: $" + contaCorrente.getSaldo());
    }
}
