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

        System.out.println("-------------------------------");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(10);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();

        System.out.println("-------------------------------");
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(20);

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        System.out.println();
        System.out.println();
        verificadorPrimo.verificarSeEhPrimo(7);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        geradorPrimo.gerarProximoPrimo(5);
    }
}
