package desafios.desafio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Exercício 1
        Pessoa pessoa = new Pessoa();
        String mensagem = pessoa.exibeMensagem();
        System.out.println(mensagem);

        Scanner entrada = new Scanner(System.in);

        //Exercício 2
        Calculadora calculadora = new Calculadora();
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int resultado = calculadora.calcularDobroDoNumero(numero);
        System.out.printf("%d x 2 = %d", numero, resultado);
        System.out.println();
        System.out.println();

        //Exercício 3
        Musica musica = new Musica();
        musica.titulo = "Maremotos";
        musica.artista = "Supercombo";
        musica.anoDeLancamento = 2019;
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite sua avaliação: ");
            double avaliacao = entrada.nextDouble();
            musica.avaliarMusica(avaliacao);
        }
        double avalicao = musica.calcularMediaDeAvaliacoes();
        String ficha = musica.exibeFichaTecnica(avalicao);
        System.out.println(ficha);
        System.out.println();

        //Exercício 4
        Carro carro = new Carro();
        carro.modelo = "Onix";
        carro.cor = "Prata";
        carro.anoDeLancamento = 2012;
        carro.calcularIdadeDoCarro();
        String fichaTecnica = carro.exibeFichaTecnica();
        System.out.println(fichaTecnica);
        System.out.println();

        //Exercício 5
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.idade = 26;
        aluno.exibeInformacoesDoAluno();
    }
}
