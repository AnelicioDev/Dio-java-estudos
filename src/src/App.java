package src;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Condicional condicao = new Condicional();
        Repeticao alunos = new Repeticao();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qaual o número do aluno?");
        int posicaoDoAluno = scanner.nextInt();

        alunos.quantidadeDeAlubnos(posicaoDoAluno);

        condicao.Maior(idade);


        scanner.close();
    }
}
