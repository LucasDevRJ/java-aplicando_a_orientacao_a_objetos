/**
 * 1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
 * com o método converterDolarParaReal() para converter um valor em dólar para reais.
 * A classe deve receber o valor em dólar como parâmetro.
 */

package desafios.desafio04;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        double cotacao = 5.54; //cotação do dia 20/12/2025
        double valorEmReais = valorEmDolar * cotacao;
        return valorEmReais;
    }

}
