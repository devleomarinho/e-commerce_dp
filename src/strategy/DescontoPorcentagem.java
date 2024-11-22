package strategy;

public class DescontoPorcentagem implements DescontoStrategy {
    private final double porcentagem;

    public DescontoPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal - (valorTotal * (porcentagem / 100));
    }
}
