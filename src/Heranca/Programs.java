package Heranca;

import Heranca.Entities.Conta;
import Heranca.Entities.ContaDeNegocio;
import Heranca.Entities.Poupanca;

public class Programs {
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "Alex", 0.0);
        ContaDeNegocio contaCorrente = new ContaDeNegocio(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Conta conta1 = contaCorrente;
        Conta conta2 = new ContaDeNegocio(1003, "Bob", 0.0, 200.0);
        Conta conta3 = new Poupanca(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        ContaDeNegocio contaCorrente1 = (ContaDeNegocio) conta2;

        if (conta3 instanceof ContaDeNegocio){
            ContaDeNegocio contaCorrente2 = (ContaDeNegocio) conta3;
            contaCorrente2.empretimo(200.00);
            System.out.println("Emprestimo");
        }
    }
}
