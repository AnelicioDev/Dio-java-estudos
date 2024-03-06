package matriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i<mat.length; i++){
            for (int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz principal: ");
        for (int i = 0; i<n; i++){
            System.out.println(mat[i][i] + " ");
        }

        System.out.println("Número negativo: ");
        int contador = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (mat[i][j] < 0){
                    contador++;
                }
            }
        }
        System.out.println("Quantidade: " + contador);
    }
}
