package com.company;

public abstract class FuncionarioCLT {

    protected String nome;
    protected String documento;

    protected Endereco endereco;

    protected Double valorSalario;

    public FuncionarioCLT(String nome, String documento, Endereco endereco, Double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.valorSalario = valorSalario;
    }

    public FuncionarioCLT() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }


    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", valorSalario=" + valorSalario +
                '}';

    }
}
