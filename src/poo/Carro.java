package poo;

public class Carro extends Veiculo {
    public void ligar(String oleo, String gasolina){
        verificarOleo(oleo);
        verificarGasolina(gasolina);
        System.out.println("Ligar carro");
    }
    private void verificarOleo(String verificado){
        System.out.println("Verificando óleo: " + verificado);
    }
    private void verificarGasolina(String verificado){
        System.out.println("Verificando gasolina: " + verificado);
    }
}
