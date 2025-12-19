package desafios.desafio03;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.definirNomeDoModelo("Toyota Corolla");
        modeloCarro.definirPrecosMediosDosTresAnos(142000, 144000, 141000);
        modeloCarro.exibirMaiorPrecoMedio();
        modeloCarro.exibirMenorPrecoMedio();

        System.out.println("-------------------------------");

        Animal animal = new Animal();
        animal.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
