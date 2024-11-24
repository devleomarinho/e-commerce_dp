package model;

import strategy.DescontoStrategy;
import strategy.SemDesconto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private final List<Produto> produtos = new ArrayList<>();
    private DescontoStrategy descontoStrategy = new SemDesconto();

    public void adicionarProduto (Produto produto){
        produtos.add(produto);
    }

    public void definirDesconto(DescontoStrategy descontoStrategy){
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotal(){
        double valorTotal= 0;

        for(Produto produto : produtos){
            valorTotal += produto.getPreco();
        }

        return descontoStrategy.aplicarDesconto(valorTotal);
    }


}
