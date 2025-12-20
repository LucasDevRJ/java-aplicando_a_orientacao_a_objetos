package desafios.desafio03;

public class GeradorPrimo extends NumerosPrimos {

    public void gerarProximoPrimo(int numero) {
        int proximoPrimo = numero;
        do {
            proximoPrimo++;
        } while (!verificarPrimalidade(proximoPrimo));
        System.out.println("O próximo número primo é " + proximoPrimo);
    }
}
