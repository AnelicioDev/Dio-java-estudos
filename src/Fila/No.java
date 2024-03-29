package Fila;

public class No<T> {
    private T conteudo; //Guarda o valor
    private No<T> proximoNo;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No(T conteudo, No<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                ", proximoNo=" + proximoNo +
                '}';
    }
}
