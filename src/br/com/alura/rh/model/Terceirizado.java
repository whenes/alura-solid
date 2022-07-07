package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private DadosPessoais dadosPessoas;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoas = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }
}
