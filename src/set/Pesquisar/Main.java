package set.Pesquisar;

public class Main {
    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();

        contato.adicionarContato("Pedro", 99005566);
        contato.adicionarContato("Carlos", 99004433);
        contato.adicionarContato("Ana", 99007777);
        contato.adicionarContato("Bia", 99003545);
        contato.adicionarContato("Bia Santos", 99003545);

        //contato.exibirContato();

        System.out.println(contato.pesquisarContato("Bia"));

        contato.contatParaAtualizar("Bia", 99006767);

        contato.exibirContato();
    }
}
