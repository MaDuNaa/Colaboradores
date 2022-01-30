package com.company;

public class vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    public vendedor() {
    }

    public vendedor(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public void calculateBonificacao(Double porcentagemBonificacao) {
       this.valorBonificacao = super.getValorSalario() * porcentagemBonificacao;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                ", valorSalario=" + valorSalario +
                ", valorBonificacao =" + valorBonificacao +
                '}';
    }


}
;