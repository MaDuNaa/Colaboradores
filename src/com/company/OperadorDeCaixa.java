package com.company;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    public OperadorDeCaixa() {
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
