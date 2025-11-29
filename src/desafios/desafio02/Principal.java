package desafios.desafio02;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(443223);
        contaBancaria.setSaldo(1000);
        contaBancaria.titular = "Lucas";
        contaBancaria.exibeContaBancaria();

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Lucas");
        idadePessoa.setIdade(26);
        idadePessoa.verificarIdade();

        Produto produto = new Produto();
        produto.setNome("Console Xbox Series X");
        produto.setPreco(5455.00);
        double valorComDesconto = produto.aplicarDesconto(10);
        System.out.printf("\nO %s com tem o valor de %.2f, mas com o desconto de 10%%, ele fica com o valor de %.2f.",
                produto.getNome(), produto.getPreco(), valorComDesconto);
    }
}
