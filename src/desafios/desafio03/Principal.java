package desafios.desafio03;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.definirNomeDoModelo("Toyota Corolla");
        modeloCarro.definirPrecosMediosDosTresAnos(142000, 144000, 141000);
        modeloCarro.exibirMaiorPrecoMedio();
        modeloCarro.exibirMenorPrecoMedio();
    }
}
