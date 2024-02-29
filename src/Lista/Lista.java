package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Joana");
        list.add("Paulo");
        list.add("Kaio");
        list.add(1, "Marcia");

        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------- Remove ----------");
        list.remove(2);
        list.removeIf(x -> x.charAt(0) == 'K'); //x.charAt(0) = mostra posição da letra.

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-----------indexOf----------");
        System.out.println("Index of Marcia: " + list.indexOf("Marcia")); //Qual a posição na lista

        System.out.println("-----------Mantem na lista----------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList()); //colect tranforma em lista novamnte
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-----------Retorna uma resposta----------");
        //se não for ncontrado o parametro desejado retorna algo
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
