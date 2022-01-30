package com.company;

public class Gerente implements CalculaBonificacao {

    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHoras;
    private Double valorBonificacao;
    private Double valorRemuneracao;


    @Override
    public void calculateBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorRemuneracao * porcentagemBonificacao;
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

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    public Gerente() {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoras = valorHoras;


    }

    public void calculaRemuneracao() {
      this.valorRemuneracao = this.horasTrabalhadas * this.valorHoras;

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHoras=" + valorHoras +
                ", valorBonificacao=" + valorBonificacao +
                ", valorRemuneracao=" + valorRemuneracao +
                '}';
    }
}
