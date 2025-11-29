/**
 * 1. Crie uma classe ContaBancaria com os seguintes atributos:
 * numeroConta (privado), saldo (privado) e titular (publico).
 * Implemente métodos getters e setters para os atributos privados.
 */

package desafios.desafio02;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibeContaBancaria() {
        String informacoes = """
                Número da conta: %d
                Saldo: %.2f
                Titular: %s
                """.formatted(getNumeroConta(), getSaldo(), titular);
        System.out.println(informacoes);
    }
}
