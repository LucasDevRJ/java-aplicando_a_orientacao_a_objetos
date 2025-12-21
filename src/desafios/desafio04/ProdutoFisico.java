package desafios.desafio04;

public class ProdutoFisico implements Calculavel {

    protected double preco;
    protected double desconto;
    protected double taxa;

    @Override
    public double calcularPrecoFinal() {
        double valorTaxa = preco * (taxa / 100);
        double precoFinal = preco + valorTaxa;
        return precoFinal;
    }

}
