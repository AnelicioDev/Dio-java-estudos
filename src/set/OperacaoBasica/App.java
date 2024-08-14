package set.OperacaoBasica;

public class App {
    public static void main(String[] args) {
        ConjuntoConvidado c = new ConjuntoConvidado(null);

        c.addConvidado("Ana", 221);
        c.addConvidado("Carlos", 222);
        c.addConvidado("Pedro", 223);
        c.addConvidado("Maria", 221);
        c.addConvidado("Felipa", 225);

        c.removerConvidado(221);

        c.exibirConvidado();
    }
}
