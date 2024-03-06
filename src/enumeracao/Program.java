package enumeracao;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Loja loja = new Loja(155, new Date(), Status.Enviado);
        System.out.println(loja);
    }
}
