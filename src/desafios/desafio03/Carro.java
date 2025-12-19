/**
 * 1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
 * Implemente métodos para definir o nome do modelo, os preços médios para cada ano,
 * e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas,
 * utilizando-a na classe principal para definir preços e mostrar informações.
 */

package desafios.desafio03;

public class Carro {

    private String nomeDoModelo;
    private double precoMedioPrimeiroAno;
    private double precoMedioSegundoAno;
    private double precoMedioTerceiroAno;

    public void definirNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
        System.out.println("Nome do modelo foi definido com sucesso!");
    }

    public void definirPrecosMediosDosTresAnos(double precoMedioPrimeiroAno, double precoMedioSegundoAno, double precoMedioTerceiroAno) {
        this.precoMedioPrimeiroAno = precoMedioPrimeiroAno;
        this.precoMedioSegundoAno = precoMedioSegundoAno;
        this.precoMedioTerceiroAno = precoMedioTerceiroAno;
        System.out.println("Os preços médios dos três primeiros anos foram definidos com sucesso!");
    }

    public void exibirMaiorPrecoMedio() {
        double maiorPreco = precoMedioPrimeiroAno;
        if (maiorPreco < precoMedioSegundoAno) {
            maiorPreco = precoMedioSegundoAno;
        }

        if (maiorPreco < precoMedioTerceiroAno) {
            maiorPreco = precoMedioTerceiroAno;
        }

        System.out.println("O maior preço médio é R$" + maiorPreco);
    }

    public void exibirMenorPrecoMedio() {
        double menorPreco = precoMedioPrimeiroAno;
        if (menorPreco > precoMedioSegundoAno) {
            menorPreco = precoMedioSegundoAno;
        }

        if (menorPreco > precoMedioTerceiroAno) {
            menorPreco = precoMedioTerceiroAno;
        }

        System.out.println("O menor preço médio é R$" + menorPreco);
    }
}
