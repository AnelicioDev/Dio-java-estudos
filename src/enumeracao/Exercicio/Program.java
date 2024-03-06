package enumeracao.Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamantoNome = sc.nextLine();
        System.out.println("Entre com dados do trabalhador: ");
        System.out.print("nome do trabalhador: ");
        String trabalhadorNome = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalho trabalho = new Trabalho(trabalhadorNome, NilvelDoTrabalho.valueOf(nivelTrabalhador), salarioBase, new Departamento(departamantoNome));

        System.out.print("Quantos contratos esse trabalhador vai ter? ");
        int numeroDecontratros = sc.nextInt();

        for (int i = 1; i <= numeroDecontratros; i++){
            System.out.println("Contarto #" + i + " Data: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Durção (Horas): ");
            int horas = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataDoContrato, valorPorHora, horas);
            trabalho.addContrato(contrato);
        }
        System.out.println();
        System.out.print("insira a mes e ano para caulcular o rendimento (MM/YYYY) ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0 ,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + trabalho.getNome());
        System.out.println("Departamento: " + trabalho.getDepartamento().getName());
        System.out.println("Rendimento por: " + mesEAno + ": " + String.format("%.2f",trabalho.renda(ano, mes)));

        sc.close();
    }
}
