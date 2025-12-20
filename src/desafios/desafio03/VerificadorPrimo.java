package desafios.desafio03;

public class VerificadorPrimo extends NumerosPrimos {

    public void verificarSeEhPrimo(int numero) {
        boolean ehPrimo = verificarPrimalidade(numero);
        if (ehPrimo) {
            System.out.println("O número " + numero + " é um número primo.");
        } else {
            System.out.println("O número " + numero + " não é um número primo.");
        }
    }

}
