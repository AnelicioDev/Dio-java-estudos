package Fila;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adidiona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }

}
