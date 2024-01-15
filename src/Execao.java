import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Execao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade;
        String nome;
        try{
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        }catch(InputMismatchException e){
            System.out.println("A idade tem que ser numérica!");
        }


        scanner.close();
    }
}
