package desafios.desafio04;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double valorEmReais = conversorMoeda.converterDolarParaReal(200);
        System.out.printf("R$%.2f\n", valorEmReais);

        System.out.println("-----------------------------");
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        double area = calculadoraSalaRetangular.calcularArea(12, 8);
        double perimetro = calculadoraSalaRetangular.calcularPerimetro(7, 4);

        System.out.println("Área: " + area + "cm²");
        System.out.println("Perímetro: " + perimetro + "cm²");
        System.out.println("-----------------------------");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);
        System.out.println("-----------------------------");
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        double fahrenheit = conversorTemperaturaPadrao.celsiusParaFahrenheit(30);
        double celsius = conversorTemperaturaPadrao.fahrenheitParaCelsius(50);
        System.out.printf("%.2f°F\n", fahrenheit);
        System.out.printf("%.2f°C\n", celsius);
    }
}
