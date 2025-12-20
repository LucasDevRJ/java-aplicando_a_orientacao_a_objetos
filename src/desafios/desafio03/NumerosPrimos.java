/**
 * 4. Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
 * Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
 * Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o
 * VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
 */

package desafios.desafio03;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero) {
        if (numero > 1) {
            for (int i = 1; i <= 100; i++) {
                if (i != 1 && i != numero) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void listarPrimos(int numero) {
        System.out.print("Esses são os números primos até o número " + numero + ": ");
        for (int i = 2; i <= numero; i++) {
            if (verificarPrimalidade(i)) {
                if (i < numero) {
                    System.out.print(i + ", ");
                }
            }
        }
    }

}
