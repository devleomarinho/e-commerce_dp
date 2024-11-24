package main;

import model.Carrinho;
import model.Produto;
import strategy.DescontoPorcentagem;
import strategy.DescontoValorFixo;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Smartphone", 1500.00);
        Produto produto2 = new Produto("Fone de Ouvido", 200.00);


        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);


        System.out.println("Total sem desconto: R$ " + carrinho.calcularTotal());


        carrinho.definirDesconto(new DescontoPorcentagem(10));
        System.out.println("Total com 10% de desconto: R$ " + carrinho.calcularTotal());


        carrinho.definirDesconto(new DescontoValorFixo(300));
        System.out.println("Total com desconto de R$ 300: R$ " + carrinho.calcularTotal());
    }
}