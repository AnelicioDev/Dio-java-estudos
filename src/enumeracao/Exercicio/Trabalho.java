package enumeracao.Exercicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String nome;
    private NilvelDoTrabalho level;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalho(String nome, NilvelDoTrabalho level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NilvelDoTrabalho getLevel() {
        return level;
    }

    public void setLevel(NilvelDoTrabalho level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }


    public void addContrato(ContratoPorHora contrato){
        contratos.add(contrato);
    }
    public void removeContrato(ContratoPorHora contrato){
        contratos.remove(contrato);
    }
    public double renda(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoPorHora c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);

            if (ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
