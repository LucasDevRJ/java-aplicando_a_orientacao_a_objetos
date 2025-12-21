/**
 * 4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit()
 * e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao
 * que implementa essa interface com as fórmulas de conversão e exibe os resultados.
 */

package desafios.desafio04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
