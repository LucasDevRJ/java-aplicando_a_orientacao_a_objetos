package desafios.desafio03;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal() {
        saldo -= 0.01;
        System.out.println("A tarifa mensal de R$0,01 centavo foi cobrada.");
    }

}
