package set.Pesquisar;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }
    
    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatoParaPesquisar = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatoParaPesquisar.add(c);
            }
        }
        return contatoParaPesquisar;
    }

    public Contato contatParaAtualizar(String nome, int novoNumero){
        Contato contatoEditado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoEditado = c;
                break;
            }
        }
        return contatoEditado;
    }
}
