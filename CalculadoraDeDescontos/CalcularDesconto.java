package CalculadoraDeDescontos;

public class CalcularDesconto {
    //Calcular Desconto
    public void calcular(){
        System.out.println("==============");;
        double precoProduto;
        precoProduto = 200;
        System.out.println("O preço do meu produto é de"+precoProduto+"reais" );
        double percentualDesconto = 10.0;
        percentualDesconto = 20;
        System.out.println("o desconto será de "+percentualDesconto+"%");
        double desconto = precoProduto*percentualDesconto/100;
        double precoComDesconto = precoProduto-desconto;
        System.out.println("Com desconto, o produto sai"+"por R$"+precoComDesconto+".");
        System.out.println("Fim");
        System.out.println("===============");
    }
        public void calcular30(){
                System.out.println("==============");;
                double precoProduto;
                precoProduto = 200;
                System.out.println("O preço do meu produto é de"+precoProduto+"reais" );
                double percentualDesconto = 10.0;
                percentualDesconto = 30;
                System.out.println("o desconto será de "+percentualDesconto+"%");
                double desconto = precoProduto*percentualDesconto/100;
                double precoComDesconto = precoProduto-desconto;
                System.out.println("Com desconto, o produto sai"+"por R$"+precoComDesconto+".");
                System.out.println("Fim");
                System.out.println("===============");
        }
}
