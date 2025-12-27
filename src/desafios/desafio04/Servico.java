package desafios.desafio04;

public class Servico implements Vendavel {

    @Override
    public double calcularPrecoTotal(double preco, int quantidade) {
        double desconto = 0;
        if (preco > 999.99) {
            desconto = 100.00;
        } else if (preco > 499.99) {
            desconto = 50.00;
        } else if (preco > 299.99) {
            desconto = 30.00;
        }
        double precoTotal = preco * quantidade - desconto;
        return precoTotal;
    }
}
