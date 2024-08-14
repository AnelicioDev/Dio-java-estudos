package set.OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
           if (c.getCodigoDoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
           }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contaConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    
}
