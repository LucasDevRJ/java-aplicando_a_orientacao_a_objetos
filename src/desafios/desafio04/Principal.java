package desafios.desafio04;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double valorEmReais = conversorMoeda.converterDolarParaReal(200);
        System.out.printf("R$%.2f", valorEmReais);
    }
}
