package execao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> carros = new ArrayList<>();

        carros.add("HB20");
        carros.add("Polo");
        carros.add("Hargo");
        carros.add("Uno");

        System.out.println("Adicione o ID do carro:");
        int idCarro = sc.nextInt();

        try {

            System.out.println(carros.get(idCarro));

        } catch(IndexOutOfBoundsException e) {
            System.out.println("Id dos carros são de 0 a 3 !");
        }finally{
            System.out.println("Fim!!!");
        }


        sc.close();

    }
}
