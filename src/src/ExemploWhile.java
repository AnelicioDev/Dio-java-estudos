package src;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {

        double valorDoce = valorAleatorio();
        double mesada = 50.0;

        while (mesada > 50.0) {
            if (valorDoce > mesada) {
                System.out.println("Você ultrapassou o valor da mesada!");
            }
           
            mesada = mesada - valorDoce;
        }
        System.out.println(valorDoce);

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
