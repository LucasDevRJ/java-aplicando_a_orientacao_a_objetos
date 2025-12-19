package desafios.desafio03;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("O valor de R$%.2f foi depositado com sucesso.\n", valor);
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.printf("O valor de R$%.2f foi sacado com sucesso.\n", valor);
    }

    public void consultarSaldo() {
        System.out.printf("O saldo atual é de R$%.2f.\n", saldo);
    }

}
