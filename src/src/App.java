package src;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Condicional condicao = new Condicional();
        Repeticao alunos = new Repeticao();
        condicao.Maior(15);

       alunos.quantidadeDeAlubnos();

        scanner.close();
    }
}
