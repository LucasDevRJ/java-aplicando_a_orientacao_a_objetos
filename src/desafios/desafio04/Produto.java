package desafios.desafio04;

public class Produto implements Vendavel {

    @Override
    public double calcularPrecoTotal(double preco, int quantidade) {
        double desconto = 0;
        if (quantidade > 14) {
            desconto = 10.0 / 100;
        } else if (quantidade > 9) {
            desconto = 5.0 / 100;
        } else if (quantidade > 4) {
            desconto = 2.0 / 100;
        }
        double precoTotal = preco * quantidade;
        double precoTotalComDesconto = precoTotal - (precoTotal * desconto);
        return precoTotalComDesconto;
    }

}
