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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoDoConvite;
        return result;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (! (o instanceof Convidado convidado)) return false;
       return getCodigoDoConvite() == convidado.getCodigoDoConvite();
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + getNome() + ", codigoDoConvite=" + getCodigoDoConvite() + "]";
    }
    
    
}

