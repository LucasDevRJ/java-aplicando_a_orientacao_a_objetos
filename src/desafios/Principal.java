package desafios;

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

        entrada.close();

        int resultado = calculadora.calcularDobroDoNumero(numero);
        System.out.printf("%d x 2 = %d", numero, resultado);
    }
}
