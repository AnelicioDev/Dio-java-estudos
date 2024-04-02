package arquivos.pastas;

import java.io.File;
import java.util.Scanner;

public class ManipularPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta: ");
        String caminhoDaPasta = sc.nextLine();

        File path = new File(caminhoDaPasta);

        File[] folders = path.listFiles(File::isDirectory); //lista as pastas

        System.out.println("Pastas: ");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] arquivos = path.listFiles(File::isFile);

        System.err.println("Arquivos: ");
        for (File file : arquivos) {
            System.out.println(file);
        }

        boolean sucesso = new File(caminhoDaPasta + "\\New folder").mkdir(); //Cria nova pasta
        System.out.println(sucesso);

        sc.close();
    }
}
 