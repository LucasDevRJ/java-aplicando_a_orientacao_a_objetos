package desafios.desafio04;

public class Livro extends ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal() {
        double valorTaxa = preco * (taxa / 100);
        double valorDesconto = preco * (desconto / 100);
        double precoFinal = preco + valorTaxa - valorDesconto;
        return precoFinal;
    }

}
