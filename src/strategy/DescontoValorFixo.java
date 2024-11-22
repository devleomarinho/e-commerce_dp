package strategy;

public class DescontoValorFixo implements DescontoStrategy {
    private final double valorDesconto;

    public DescontoValorFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double aplicarDesconto(double valorTotal) {
        return Math.max(0, valorTotal - valorDesconto);
    }
}
