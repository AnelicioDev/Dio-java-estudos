package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemplFileEBufferedreader {
    public static void main(String[] args) {
        String caminhoArquivo = "D:\\texto.txt";
       
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
       
    }
}
