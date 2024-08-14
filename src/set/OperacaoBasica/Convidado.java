package set.OperacaoBasica;


public class Convidado {
    private String nome;
    private int codigoDoConvite;

    public Convidado(String nome, int codigoDoConvite){
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public int getCodigoDoConvite(){
        return codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + getNome() + ", codigoDoConvite=" + getCodigoDoConvite() + "]";
    }
    
    
}

