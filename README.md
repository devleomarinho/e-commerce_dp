# Projeto de E-commerce com Strategy Pattern - China Express
## Disciplina: Padrões de Projeto, Prof. Ângelo Dias

Implementação de um carrinho de compras em Java utilizando o padrão de projeto Strategy para aplicação de descontos.

## Estrutura do Projeto

- Main: Classe principal do projeto
- Model: Classes de modelo (Produto, Carrinho)
- Strategy: Implementações de estratégias de desconto

## Padrão Strategy
O projeto demonstra o uso do padrão Strategy para aplicação de diferentes estratégias de desconto de forma flexível e extensível.
Estratégias de Desconto

- SemDesconto: Sem aplicação de desconto
- DescontoPorcentagem: Desconto percentual
- DescontoValorFixo: Desconto de valor fixo

### Exemplo de Uso
```java
Carrinho carrinho = new Carrinho();
carrinho.adicionarProduto(new Produto("Livro", 100.0));
carrinho.definirDesconto(new DescontoPorcentagem(10));
double total = carrinho.calcularTotal();
```

## Benefícios

- Flexibilidade para adicionar novas estratégias de desconto
- Fácil manutenção e extensão do código
- Separação clara de responsabilidades

## Tecnologias

- Linguagem: Java
- Padrão de Projeto: Strategy
