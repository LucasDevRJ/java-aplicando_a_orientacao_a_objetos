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
        System.out.println();

        Aluno aluno = new Aluno();
        aluno.setNome("Lucas");
        aluno.setTeste(7.0);
        aluno.setProva(5.0);
        double media = aluno.calcularMedia();
        System.out.printf("\nO aluno %s tirou a nota %.2f no teste e %.2f na prova, ficando com a média de %.2f.",
                aluno.getNome(), aluno.getTeste(), aluno.getProva(), media);
        System.out.println();
        System.out.println();

        Livro livro = new Livro();
        livro.setTitulo("Simplificando o Autismo 2.0");
        livro.setAutor("Dr. Thiago Castro");
        livro.exibirDetalhes();
    }
}
