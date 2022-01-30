package com.company;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("rua1", "complemento rua 1 ", "Bairro 1");
       //vendedor vendedor = new vendedor();

        vendedor vendedor = new vendedor("Vendedor", "222.222.222-22", endereco, 1000d);
        vendedor.calculateBonificacao(0.1d);
        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("operador de Caixa", "222.222.22-222",endereco , 1500d );

        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);

         Gerente gerente;
        gerente = new Gerente();

        gerente.setNome("Gerente");
         gerente.setDocumento("111.111.111-11");
         gerente.setHorasTrabalhadas(40);
         gerente.setValorHoras(50d);
         gerente.setEndereco(endereco);

         gerente.calculaRemuneracao();
         gerente.calculateBonificacao(0.2);

        System.out.println(gerente);




    }
}
